module com.example.librarymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.librarymanagementsystem to javafx.fxml;
    exports com.example.librarymanagementsystem;
    exports com.example.librarymanagementsystem.controller;
//    exports com.example.librarymanagementsystem.model;
//    exports com.example.librarymanagementsystem.service;
}