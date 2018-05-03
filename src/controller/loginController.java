/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import model.conn;
import java.net.*;
import java.util.Map;
import java.util.Set;
import javafx.geometry.*;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.Alert;
import javafx.scene.layout.*;
//import javafx.scene.layout.*;
//import javafx.scene.text.*;
/**
 *
 * @author CLIENTE
 */
public class loginController {
    @FXML private GridPane painel;
    @FXML private Text actiontarget;
    @FXML private TextField username;
    @FXML private PasswordField password;
    
    
    private Map<String,String> atributos;
    
    public void initialize(){      
        atributos = Usuario.getAtributes();
        criaCampos();       
    }
    
    private void criaCampos(){
        Set<String> chaves = atributos.keySet();
        int cont = 1;
        for(String chave : chaves){
            Label label = new Label(atributos.get(chave));
            if(!"pass".equals(chave)){
                TextField field = new TextField();
                field.setId(chave);
                painel.add(field, 1, cont);
            }else{
                PasswordField field = new PasswordField();
                field.setId(chave);
                painel.add(field, 1, cont);
            }
            
            painel.add(label, 0, cont);
            
            cont++;
        }
    }
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        Parent parent = this.painel.getParent();
        username = (TextField)painel.lookup("#user");
        password = (PasswordField)painel.lookup("#pass");
        //boolean logar = Usuario.logar(user.getText(), pass.getText());        
        if("admin".equals(username.getText()) && "admin".equals(password.getText())){
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
