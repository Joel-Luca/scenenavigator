package scenenavigator.common;

import javafx.scene.*;
import javafx.stage.*;
import java.util.*;

public class Navigator {
    private Stage stage;
    private Map<SceneType, Scene> sceneMap = new HashMap<>();

    public Navigator(Stage stage) {
        this.stage = stage;
    }

    public void registrerScene(SceneType sceneType, Scene scene) {
        sceneMap.put(sceneType, scene);
    }

    public void navigateTo(SceneType sceneType) {
        stage.setScene(sceneMap.get(sceneType));
        stage.show();
    }

}
