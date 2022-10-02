package com.bmstechpro.javafxviewmanager;
/* javafx-view-manager
 * @created 10/02/2022
 * @author Konstantin Staykov
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AboutController {
    @FXML
    protected void back(ActionEvent actionEvent) {
        ViewManager.switchTo(View.MAIN);
    }
}
