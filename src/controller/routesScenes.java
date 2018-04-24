/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author CLIENTE
 */
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class routesScenes {
    
    public routesScenes(){
        
        
    }
    
    public Scene changeScene(String choice) throws IOException{
        switch(choice){
            case "login":
                return loginView();
            case "teste":
                return testeView();
        }
        
        return loginView();
    }
    
    public Scene loginView() throws IOException{
        
        Parent login = FXMLLoader.load(getClass().getResource("/view/login.fxml"));
        Scene scene = new Scene(login, 500, 300);
        
        return scene;
    }
    
    public Scene testeView() throws IOException{
        
        Parent login = FXMLLoader.load(getClass().getResource("/view/teste.fxml"));
        Scene scene = new Scene(login, 500, 300);

        return scene;
    }
    
    
    
}
