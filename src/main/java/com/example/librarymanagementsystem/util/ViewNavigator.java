package com.example.librarymanagementsystem.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;

public class ViewNavigator {
    private static Stage mainStage;
    @Getter
    @Setter
    private static String currentScreen;
    private static Object currentController;

    public static void setMainStage(Stage stage) {
        mainStage = stage;

        // Checks if style has already been set to avoid errors on reload
        if (mainStage.getStyle() != StageStyle.TRANSPARENT) {
            mainStage.initStyle(StageStyle.TRANSPARENT);
        }
    }

    public static void switchScreen(String screen) {
        if (currentScreen != null) {

        }

        renderScreen(screen);
    }

    private static void renderScreen(String screen) {
        try {
            //
            FXMLLoader fxmlLoader = new FXMLLoader(ViewNavigator.class.getResource(screen));
            Parent root = fxmlLoader.load();
            //
            setCurrentScreen(screen);
            currentController = fxmlLoader.getController();
            //
            Scene scene = new Scene(root, Color.TRANSPARENT);
            scene.getStylesheets().add(ViewNavigator.class.getResource("/css/style.css").toExternalForm());
            //
            mainStage.setScene(scene);
            mainStage.centerOnScreen();
            mainStage.show();

        } catch (IOException e) {
            System.out.println("Render Screen Error: System was unable to render screen %s".formatted(screen)
                     + " -> \n" +e.getMessage());
            e.printStackTrace();
        }
    }

    // Closes the system with the currently rendered screen
    public static void closeScreen() { mainStage.close(); }

    // Minimizes the window with the currently rendered screen
    public static void minimizeScreen() { mainStage.setIconified(true); }

    // Maximizes the window with the currently rendered screen
    public static void maximizeScreen() { mainStage.setMaximized(!mainStage.isMaximized()); }

}
