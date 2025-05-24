package socialmedia.view;

import javafx.animation.FadeTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
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
        VBox layout = new VBox(20);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.TOP_LEFT);

        // Foto profil
        ImageView profileImage = new ImageView(new Image(user.getProfileImagePath()));
        profileImage.setFitWidth(120);
        profileImage.setFitHeight(120);
        profileImage.setClip(new Circle(60, 60, 60));

        // Nama dan tombol
        Label nickLabel = new Label(user.getNickName());
        nickLabel.setStyle("-fx-font-size: 22px; -fx-font-weight: bold;");
        Label fullLabel = new Label(user.getFullName());
        fullLabel.setStyle("-fx-font-size: 16px;");

        Button addPostButton = new Button("Add Post");
        addPostButton.setOnAction(e -> new UploadPostWindow(this).show());

        VBox infoBox = new VBox(8, nickLabel, fullLabel, addPostButton);
        infoBox.setAlignment(Pos.TOP_LEFT);

        // Baris profil (foto kiri, info kanan)
        HBox userRow = new HBox(20, profileImage, infoBox);
        userRow.setAlignment(Pos.TOP_LEFT);

        // Tambahkan garis pemisah
        Separator separator = new Separator();
        separator.setPadding(new Insets(20, 0, 10, 0));

        layout.getChildren().addAll(userRow, separator, postsPane);
        scene = new Scene(layout, 800, 700);
    }

    public void addPost(Post post) {
        posts.add(post);

        ImageView postImage = new ImageView(new Image(post.getPostImagePath()));
        postImage.setFitWidth(200);
        postImage.setFitHeight(200);
        postImage.setPreserveRatio(false); // <-- Biar semua gambar selalu kotak 1:1

        Rectangle clip = new Rectangle(200, 200);
        clip.setArcWidth(20);
        clip.setArcHeight(20);
        postImage.setClip(clip);

        Label caption = new Label(post.getCaption());
        caption.setStyle(
            "-fx-background-color: rgba(0,0,0,0.5);" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 18px;" +      // Font lebih proporsional
            "-fx-font-weight: bold;" +
            "-fx-padding: 0;"
        );
        caption.setMaxWidth(Double.MAX_VALUE);
        caption.setMaxHeight(Double.MAX_VALUE);
        caption.setWrapText(true);
        caption.setOpacity(0);
        caption.setMouseTransparent(true);
        caption.setAlignment(Pos.CENTER);

        StackPane postContainer = new StackPane(postImage, caption);
        postContainer.setMinWidth(200);
        postContainer.setMinHeight(200);
        postContainer.setPrefWidth(200);
        postContainer.setPrefHeight(200);
        postContainer.setMaxWidth(200);
        postContainer.setMaxHeight(200);
        postContainer.setAlignment(Pos.CENTER);
        StackPane.setAlignment(caption, Pos.CENTER);

        FadeTransition fadeIn = new FadeTransition(Duration.millis(300), caption);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);

        FadeTransition fadeOut = new FadeTransition(Duration.millis(300), caption);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);

        // Efek zoom dan fade pada postContainer, bukan postImage saja
        postContainer.setOnMouseEntered(e -> {
            fadeIn.playFromStart();
            postContainer.setScaleX(1.05);
            postContainer.setScaleY(1.05);
        });
        postContainer.setOnMouseExited(e -> {
            fadeOut.playFromStart();
            postContainer.setScaleX(1.0);
            postContainer.setScaleY(1.0);
        });

        caption.setOnMouseClicked(e -> System.out.println("Caption clicked: " + post.getCaption()));

        postImage.setOnMouseClicked(e -> {
            Stage imageStage = new Stage();
            ImageView fullImage = new ImageView(new Image(post.getPostImagePath()));
            fullImage.setPreserveRatio(true);
            fullImage.setFitWidth(700); // Atur sesuai kebutuhan
            fullImage.setFitHeight(800);

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