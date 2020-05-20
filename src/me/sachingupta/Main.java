package me.sachingupta;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String... args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("view/login.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("view/pointOfSale.fxml"));
        Font.loadFont(getClass().getResourceAsStream("fonts/Playball-Regular.ttf"),40);
        Font.loadFont(getClass().getResourceAsStream("fonts/BubblerOne-Regular.ttf"),40);
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("images/logo.png")));
        primaryStage.show();
    }
}
