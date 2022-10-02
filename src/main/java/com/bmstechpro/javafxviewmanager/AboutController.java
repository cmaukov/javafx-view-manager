package com.bmstechpro.javafxviewmanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AboutController {
    @FXML
    protected void back(ActionEvent actionEvent) {
        ViewManager.switchTo(View.MAIN);
    }
}
