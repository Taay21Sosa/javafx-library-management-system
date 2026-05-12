package com.example.librarymanagementsystem;

import com.example.librarymanagementsystem.util.ConstantsUtil;
import com.example.librarymanagementsystem.util.ViewNavigator;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewNavigator.setMainStage(primaryStage);
        ViewNavigator.switchScreen(ConstantsUtil.LOGIN);
    }
}
