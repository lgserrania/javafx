/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.sqlUsuarios;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import model.conn;
import java.net.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert;
//import javafx.scene.layout.*;
//import javafx.scene.text.*;
/**
 *
 * @author CLIENTE
 */
public class loginController {
    @FXML private Text actiontarget;
    @FXML private TextField usuario;
    @FXML private PasswordField pass;
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        boolean logar = sqlUsuarios.logar(usuario.getText(), pass.getText());        
        if(logar){
            /*Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("Informação de login");
            alerta.setHeaderText("Você foi logado com sucesso!");
            alerta.showAndWait();*/
            try{
                switchScenes.choiceScene("teste");
            }catch(Exception ex){
                System.out.println(ex);
            }
        }else{
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Informação de login");
            alerta.setHeaderText("Você inseriu dados incorretos!");
            alerta.showAndWait();
        }
        
    }
}
