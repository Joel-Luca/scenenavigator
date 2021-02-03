package scenenavigator.views;

import javafx.scene.*;
import javafx.scene.control.*;
import scenenavigator.common.*;

public class SceneTwo extends Scene {
    private Navigator navigator;
    private static  Group rootNode = new Group();

    public SceneTwo(Navigator navigator) {
        super(rootNode);

        this.navigator = navigator;

        Button button = new Button("Go back to scene one");
        rootNode.getChildren().add(button);
        button.setOnAction(e -> navigator.navigateTo(SceneType.ONE));
    }
}
