package app;

import javafx.application.Application;
import javafx.stage.Stage;
import app.scene.RegisterScene;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        RegisterScene registerScene = new RegisterScene(primaryStage);
        primaryStage.setTitle("Social Media App");
        primaryStage.setScene(registerScene.getScene());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
