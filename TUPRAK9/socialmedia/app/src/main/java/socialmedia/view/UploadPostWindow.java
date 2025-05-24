package socialmedia.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import socialmedia.model.Post;

import java.io.File;

public class UploadPostWindow {
    private Stage window;
    private String imagePath;

    public UploadPostWindow(HomeScene homeScene) {
        this.window = new Stage();

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);

        Button uploadButton = new Button("Upload Image");
        ImageView imageView = new ImageView();
        imageView.setFitWidth(250);
        imageView.setFitHeight(150);

        uploadButton.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(window);
            if (file != null) {
                imagePath = file.toURI().toString();
                imageView.setImage(new Image(imagePath));
            }
        });

        TextField captionField = new TextField();
        captionField.setPromptText("Caption");

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            Post post = new Post(captionField.getText(), imagePath);
            homeScene.addPost(post);
            window.close();
        });

        layout.getChildren().addAll(uploadButton, imageView, captionField, submitButton);
        window.setScene(new Scene(layout, 400, 400));
    }

    public void show() {
        window.setTitle("Upload Post");
        window.show();
    }
}