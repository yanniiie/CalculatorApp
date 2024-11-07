package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main {



        @Override
        public void start(Stage primaryStage) {
            try {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CalculatorView.fxml")));
                primaryStage.setTitle("CalculatorApp");
                primaryStage.setScene(new Scene(root, 320, 400));
                primaryStage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            launch(args);
        }
}
