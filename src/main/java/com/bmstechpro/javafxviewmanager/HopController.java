package com.bmstechpro.javafxviewmanager;
/* javafx-view-manager
 * @created 10/02/2022
 * @author Konstantin Staykov
 */

import javafx.fxml.FXML;

public class HopController {
    @FXML
    protected void onMain(){
        ViewManager.switchTo(View.MAIN);
    }
}
