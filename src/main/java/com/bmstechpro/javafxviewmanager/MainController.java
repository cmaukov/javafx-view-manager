package com.bmstechpro.javafxviewmanager;
/* javafx-view-manager
 * @created 10/02/2022
 * @author Konstantin Staykov
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {
    @FXML
    protected void about(ActionEvent actionEvent) {
        ViewManager.switchTo(View.ABOUT);
    }
}
