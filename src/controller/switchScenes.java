/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 *
 * @author CLIENTE
 */
public class switchScenes extends Application {
    
    public static Stage stage = null;
    public static routesScenes routes = new routesScenes();
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        stage.setTitle("Programa de teste de login");
        stage.setScene(routes.changeScene("login"));
        stage.show();
    }

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        
        launch(args);
        
    }
    
    public static void choiceScene(String choice) throws IOException{
        stage.setScene(routes.changeScene(choice));
    }
    
}
