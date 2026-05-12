package com.example.librarymanagementsystem.controller;

import com.example.librarymanagementsystem.util.ConstantsUtil;
import com.example.librarymanagementsystem.util.ViewNavigator;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public Button closeSystemBtn;
    public Button minimizeSystemBtn;
    public Button maximizeSystemBtn;
    public Button githubBtn;
    public Button googleBtn;
    public TextField emailFld;
    public Label emailStatusLbl;
    public TextField passwordFld;
    public Label passwordStatusLbl;
    public CheckBox rememberChk;
    public Label forgetLbl;
    public Button loginBtn;
    public Label newAccountLbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loginActions();
    }

    //-----> System Control Functions <-----
    /**
     * Closes the systems currently active screen.
     * Delegates to ViewNavigator which manages the primary stage.
     */
//    public void closeWindow() {
//        ViewNavigator.closeWindow();
//    }

     // Maximizes or restores the systems currently active screen.
//    public void maximizeWindow() {
//        ViewNavigator.maximizeWindow();
//    }

     // Minimizes the systems currently active screen to taskbar.
//    public void minimizeWindow() {
//        ViewNavigator.minimizeWindow();
//    }

    //-----> System Login Functions <-----

    private void loginActions() {
        loginBtn.setOnAction(e -> handleLogin());
    }

    private void handleLogin() {
        String email = emailFld.getText();
        String password = passwordFld.getText();

        if (!email.isEmpty() || !password.isEmpty()) {
            ViewNavigator.switchScreen(ConstantsUtil.DASHBOARD);
        }

        emailStatusLbl.getStylesheets().removeAll("hidden");
        passwordStatusLbl.getStylesheets().removeAll("hidden");
    }
}
