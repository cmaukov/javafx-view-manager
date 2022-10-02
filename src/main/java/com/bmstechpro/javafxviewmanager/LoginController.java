package com.bmstechpro.javafxviewmanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LoginController {
    @FXML
    protected void login(ActionEvent actionEvent) {
        ViewManager.switchTo(View.MAIN);
    }
}
