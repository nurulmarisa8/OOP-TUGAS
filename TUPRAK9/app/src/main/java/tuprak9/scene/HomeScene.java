package app.scene;

import app.model.User;
import app.model.Post;
import app.controller.UploadWindow;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class HomeScene {
    private Scene scene;
    private ArrayList<Post> posts = new ArrayList<>();
    private VBox postBox = new VBox(10);

    public HomeScene(Stage stage, User user) {
        BorderPane root = new BorderPane();
        root.setPadding(new javafx.geometry.Insets(20));

        // Profile Info
        VBox profileBox = new VBox(5);
        profileBox.setAlignment(Pos.CENTER);
        ImageView profileImage = new ImageView(user.getProfileImage());
        profileImage.setFitWidth(100);
        profileImage.setFitHeight(100);
        Label nameLabel = new Label(user.getFullName() + " (" + user.getNickName() + ")");
        profileBox.getChildren().addAll(profileImage, nameLabel);

        // Upload Button
        Button uploadButton = new Button("Upload Post");
        uploadButton.setOnAction(e -> {
            Post newPost = UploadWindow.display();
            if (newPost != null) {
                posts.add(newPost);
                refreshPosts();
            }
        });

        ScrollPane scrollPane = new ScrollPane(postBox);
        scrollPane.setFitToWidth(true);

        VBox centerBox = new VBox(10, uploadButton, scrollPane);
        root.setTop(profileBox);
        root.setCenter(centerBox);

        this.scene = new Scene(root, 600, 500);
    }

    private void refreshPosts() {
        postBox.getChildren().clear();
        for (Post post : posts) {
            VBox postContainer = new VBox();
            ImageView postImage = new ImageView(post.getPostImage());
            postImage.setFitWidth(300);
            postImage.setPreserveRatio(true);

            Tooltip captionTooltip = new Tooltip(post.getCaption());
            Tooltip.install(postImage, captionTooltip);

            postContainer.getChildren().add(postImage);
            postBox.getChildren().add(postContainer);
        }
    }

    public Scene getScene() {
        return scene;
    }
}
