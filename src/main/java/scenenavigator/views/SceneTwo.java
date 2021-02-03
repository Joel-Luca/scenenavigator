package scenenavigator.views;

import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import scenenavigator.common.*;

public class SceneTwo extends Scene {
    private Navigator navigator;
    private static  Group rootNode = new Group();

    public SceneTwo(Navigator navigator) {
        super(rootNode);

        this.navigator = navigator;

        Button button = new Button("Go back to scene one");
        VBox vbox = new VBox();
        vbox.getChildren().add(button);
        VBox.setMargin(button, new Insets(20));

        rootNode.getChildren().add(vbox);
        button.setOnAction(e -> {
            navigator.navigateTo(SceneType.ONE);
            SceneOne sceneOne = (SceneOne) navigator.getSceneMap().get(SceneType.ONE);
            sceneOne.setNumber(sceneOne.getNumber() + 1);
            sceneOne.getNumberLabel().setText("Increment: " + Integer.toString(sceneOne.getNumber()));
        });
    }
}
