package app.controller;

import app.model.Post;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.*;

import java.io.File;
import java.io.FileInputStream;

public class UploadWindow {
    public static Post display() {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Upload Post");

        VBox layout = new VBox(10);
        layout.setStyle("-fx-padding: 20;");

        TextField captionField = new TextField();
        captionField.setPromptText("Caption");

        ImageView postImage = new ImageView();
        postImage.setFitWidth(300);
        postImage.setPreserveRatio(true);

        final Image[] selectedImg = new Image[1];

        Button uploadImageBtn = new Button("Upload Image");
        uploadImageBtn.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(window);
            if (file != null) {
                try {
                    selectedImg[0] = new Image(new FileInputStream(file));
                    postImage.setImage(selectedImg[0]);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        Button submit = new Button("Submit");
        final Post[] result = new Post[1];
        submit.setOnAction(e -> {
            if (selectedImg[0] != null && !captionField.getText().isEmpty()) {
                result[0] = new Post(captionField.getText(), selectedImg[0]);
                window.close();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Isi gambar dan caption!");
                alert.show();
            }
        });

        layout.getChildren().addAll(uploadImageBtn, postImage, captionField, submit);
        Scene scene = new Scene(layout, 400, 400);
        window.setScene(scene);
        window.showAndWait();

        return result[0];
    }
}
