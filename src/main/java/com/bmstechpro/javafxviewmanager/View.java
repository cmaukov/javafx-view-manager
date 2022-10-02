package com.bmstechpro.javafxviewmanager;

public enum View {
    LOGIN("login.fxml"),
    MAIN("main.fxml"),
    ABOUT("about.fxml");

    View(String fileName) {
        this.fileName = fileName;
    }

    private final String fileName;

    public String getFileName() {
        return fileName;
    }
}
