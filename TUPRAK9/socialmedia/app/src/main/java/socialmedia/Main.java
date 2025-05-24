package socialmedia;

import javafx.application.Application;
import javafx.stage.Stage;
import socialmedia.view.RegisterScene;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        RegisterScene registerScene = new RegisterScene(primaryStage);
        registerScene.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}