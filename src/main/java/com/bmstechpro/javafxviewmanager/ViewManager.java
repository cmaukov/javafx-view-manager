package com.bmstechpro.javafxviewmanager;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class ViewManager {
    private static Scene scene;

    public static void setScene(Scene scene) {
        ViewManager.scene = scene;
    }

    public static void switchTo(View view) {
        if(scene==null){
            System.out.println("Scene was not set");
            return;
        }
        try {
            Parent root = FXMLLoader.load(ViewManager.class.getResource(view.getFileName()));
            scene.setRoot(root);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
