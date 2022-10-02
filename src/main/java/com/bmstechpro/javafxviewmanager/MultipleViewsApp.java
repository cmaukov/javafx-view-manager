package com.bmstechpro.javafxviewmanager;
/* javafx-view-manager
 * @created 10/02/2022
 * @author Konstantin Staykov
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MultipleViewsApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        var scene = new Scene(new Pane());
        ViewManager.setScene(scene);
        ViewManager.switchTo(View.LOGIN);
        stage.setScene(scene);
        stage.show();
    }
}
