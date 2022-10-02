package com.bmstechpro.javafxviewmanager;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ViewManager {

    private static Map<View, Parent> cache = new HashMap<>();
    private static Scene scene;

    public static void setScene(Scene scene) {
        ViewManager.scene = scene;
    }

    public static void switchTo(View view) {
        if (scene == null) {
            System.out.println("Scene was not set");
            return;
        }
        try {
            Parent root;
            if (cache.containsKey(view)) {
                System.out.printf("Loading %s from cache%n", view.getFileName());
                root = cache.get(view);
            } else {
                System.out.printf("Loading %s from FXML%n", view.getFileName());
                root = FXMLLoader.load(ViewManager.class.getResource(view.getFileName()));
                cache.put(view, root);
            }
            scene.setRoot(root);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
