package scenenavigator;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import scenenavigator.common.*;
import scenenavigator.views.*;

public class App extends Application {
    @Override
    public void start(Stage primaryStage){
        Navigator navigator = new Navigator(primaryStage);
        SceneOne sceneOne = new SceneOne(navigator);
        SceneTwo sceneTwo = new SceneTwo(navigator);
        navigator.registrerScene(SceneType.ONE, sceneOne);
        navigator.registrerScene(SceneType.TWO, sceneTwo);
        navigator.navigateTo(SceneType.ONE);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
