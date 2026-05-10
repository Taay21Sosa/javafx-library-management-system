module com.example.librarymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires static lombok;

    opens com.example.librarymanagementsystem to javafx.fxml;
    exports com.example.librarymanagementsystem;
//    exports com.example.librarymanagementsystem.config;
    exports com.example.librarymanagementsystem.controller;
//    exports com.example.librarymanagementsystem.model;
//    exports com.example.librarymanagementsystem.repository;
//    exports com.example.librarymanagementsystem.service;
//    exports com.example.librarymanagementsystem.util;
}