package socialmedia.view;

import javafx.animation.FadeTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import socialmedia.model.Post;
import socialmedia.model.User;

import java.util.ArrayList;
import java.util.List;

public class HomeScene {
    private Stage stage;
    private Scene scene;
    private FlowPane postsPane = new FlowPane();
    private List<Post> posts = new ArrayList<>();

    public HomeScene(Stage stage, User user) {
        this.stage = stage;
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.TOP_CENTER);

        ImageView profileImage = new ImageView(new Image(user.getProfileImagePath()));
        profileImage.setFitWidth(120);
        profileImage.setFitHeight(120);
        profileImage.setClip(new Circle(60, 60, 60));

        Label nickLabel = new Label(user.getNickName());
        Label fullLabel = new Label(user.getFullName());

        VBox userBox = new VBox(5, profileImage, nickLabel, fullLabel);
        userBox.setAlignment(Pos.CENTER);

        Button addPostButton = new Button("Add Post");
        addPostButton.setOnAction(e -> new UploadPostWindow(this).show());

        layout.getChildren().addAll(userBox, addPostButton, postsPane);
        scene = new Scene(layout, 600, 700);
    }

    public void addPost(Post post) {
        posts.add(post);

        ImageView postImage = new ImageView(new Image(post.getPostImagePath()));
        postImage.setFitWidth(200);
        postImage.setFitHeight(120);

        // Membuat sudut gambar membulat
        Rectangle clip = new Rectangle(200, 120);
        clip.setArcWidth(24);   // Besar radius sudut, bisa diubah sesuai selera
        clip.setArcHeight(24);
        postImage.setClip(clip);

        Label caption = new Label(post.getCaption());
        caption.setStyle(
            "-fx-background-color: rgba(0,0,0,0.5);" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 20px;" +         // Ukuran font lebih kecil
            "-fx-font-weight: bold;" +
            "-fx-padding: 0;"                // Tidak ada padding
        );
        caption.setMaxWidth(Double.MAX_VALUE);
        caption.setMaxHeight(Double.MAX_VALUE);
        caption.setWrapText(true);
        caption.setOpacity(0);
        caption.setMouseTransparent(false);
        caption.setAlignment(Pos.CENTER);

        StackPane postContainer = new StackPane(postImage, caption);
        postContainer.setAlignment(Pos.CENTER);
        StackPane.setAlignment(caption, Pos.CENTER);

        FadeTransition fadeIn = new FadeTransition(Duration.millis(300), caption);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);

        FadeTransition fadeOut = new FadeTransition(Duration.millis(300), caption);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);

        postContainer.setOnMouseEntered(e -> {
            fadeIn.playFromStart();
            postImage.setScaleX(1.05);
            postImage.setScaleY(1.05);
        });
        postContainer.setOnMouseExited(e -> {
            fadeOut.playFromStart();
            postImage.setScaleX(1.0);
            postImage.setScaleY(1.0);
        });

        caption.setOnMouseClicked(e -> System.out.println("Caption clicked: " + post.getCaption()));

        postImage.setOnMouseClicked(e -> {
            Stage imageStage = new Stage();
            ImageView fullImage = new ImageView(new Image(post.getPostImagePath()));
            fullImage.setPreserveRatio(true);
            fullImage.setFitWidth(600); // Atur sesuai kebutuhan
            fullImage.setFitHeight(700);

            StackPane pane = new StackPane(fullImage);
            pane.setStyle("-fx-background-color: #333333;"); // warna gelap agar fokus ke foto
            Scene scene = new Scene(pane, 700, 800);

            imageStage.setScene(scene);
            imageStage.setTitle("Photo Detail");
            imageStage.show();
        });

        FlowPane.setMargin(postContainer, new Insets(10));
        postsPane.getChildren().add(postContainer);
    }

    public void show() {
        stage.setScene(scene);
        stage.setTitle("MyMoment");
        stage.show();
    }
}