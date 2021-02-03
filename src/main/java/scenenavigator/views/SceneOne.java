package scenenavigator.views;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import scenenavigator.common.*;

public class SceneOne extends Scene {
    private int number = 0;
    private Label numberLabel = new Label(Integer.toString(number));
    private Navigator navigator;
    private static Group rootNode = new Group();

    public SceneOne(Navigator navigator) {
        super(rootNode);

        this.navigator = navigator;

        VBox vbox = new VBox();
        HBox hbox = new HBox(5);

        Button button = new Button("Go to scene two");
        vbox.getChildren().addAll(numberLabel, button);

        VBox.setMargin(button, new Insets(20));
        VBox.setMargin(numberLabel, new Insets(20));

        rootNode.getChildren().add(vbox);
        button.setOnAction(e -> navigator.navigateTo(SceneType.TWO); );
    }
}
