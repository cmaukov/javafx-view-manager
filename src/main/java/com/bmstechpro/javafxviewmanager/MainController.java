package com.bmstechpro.javafxviewmanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {
    @FXML
    protected void about(ActionEvent actionEvent) {
        ViewManager.switchTo(View.ABOUT);
    }
}
