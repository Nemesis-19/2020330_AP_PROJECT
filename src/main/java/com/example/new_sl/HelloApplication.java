package com.example.new_sl;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Snakes & Ladders");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.getIcons().add(new Image("file:C:\\Users\\Satyam Arora\\IdeaProjects\\new_sl\\src\\main\\resources\\com\\example\\new_sl\\slb1.jpg"));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}