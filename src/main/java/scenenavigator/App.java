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
        navigator.registrerScene(SceneType.ONE, new SceneOne(navigator));
        navigator.registrerScene(SceneType.TWO, new SceneTwo(navigator));
        navigator.navigateTo(SceneType.ONE);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
