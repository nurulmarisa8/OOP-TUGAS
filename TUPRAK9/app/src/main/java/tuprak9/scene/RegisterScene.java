package app.scene;

import app.model.User;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RegisterScene {
    private Scene scene;
    private User user;

    public RegisterScene(Stage stage) {
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20;");

        TextField nicknameField = new TextField();
        nicknameField.setPromptText("Nickname");

        TextField fullnameField = new TextField();
        fullnameField.setPromptText("Full Name");

        ImageView imageView = new ImageView();
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);

        Button uploadButton = new Button("Upload Profile Image");
        final File[] selectedFile = new File[1];
        uploadButton.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(stage);
            if (file != null) {
                try {
                    Image img = new Image(new FileInputStream(file));
                    imageView.setImage(img);
                    selectedFile[0] = file;
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        Button submit = new Button("Register");
        submit.setOnAction(e -> {
            if (!nicknameField.getText().isEmpty() && !fullnameField.getText().isEmpty() && imageView.getImage() != null) {
                user = new User(nicknameField.getText(), fullnameField.getText(), imageView.getImage());
                HomeScene home = new HomeScene(stage, user);
                stage.setScene(home.getScene());
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Lengkapi semua field dan gambar!");
                alert.show();
            }
        });

        root.getChildren().addAll(nicknameField, fullnameField, uploadButton, imageView, submit);
        this.scene = new Scene(root, 400, 400);
    }

    public Scene getScene() {
        return scene;
    }
}
