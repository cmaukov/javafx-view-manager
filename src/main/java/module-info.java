module com.bmstechpro.javafxviewmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bmstechpro.javafxviewmanager to javafx.fxml;
    exports com.bmstechpro.javafxviewmanager;
}