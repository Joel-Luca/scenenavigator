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
    private Label numberLabel = new Label("Increment: " + Integer.toString(number));
    private Navigator navigator;
    private static Group rootNode = new Group();

    public SceneOne(Navigator navigator) {
        super(rootNode);

        this.navigator = navigator;

        VBox vbox = new VBox();

        Button button = new Button("Go to scene two");
        vbox.getChildren().addAll(numberLabel, button);

        VBox.setMargin(button, new Insets(20));
        VBox.setMargin(numberLabel, new Insets(20));

        rootNode.getChildren().add(vbox);
        button.setOnAction(e -> {
            navigator.navigateTo(SceneType.TWO);
            number += 1;
            numberLabel.setText("Increment: " + Integer.toString(number));
        });
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Label getNumberLabel() {
        return numberLabel;
    }

    public void setNumberLabel(Label numberLabel) {
        this.numberLabel = numberLabel;
    }
}
