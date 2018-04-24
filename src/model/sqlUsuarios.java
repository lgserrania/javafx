/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static model.conn.*;

/**
 *
 * @author CLIENTE
 */
public class sqlUsuarios {
    
    public static boolean logar(String user, String pass){
        try{
            conn conexao = new conn();
            conexao.conectar();
            String query = "SELECT * FROM usuario WHERE user = ?";
            PreparedStatement pQuery = conexao.conexao.prepareStatement(query);
            pQuery.setString(1, user);
            ResultSet resultSet = pQuery.executeQuery();
            resultSet.next();
            if(resultSet.getString("pass").equals(pass)){
                conexao.desconectar();
                return true;
            }else{
                conexao.desconectar();
                return false;
            }           
        }catch(Exception ex){
            System.out.println(ex);
            return false;
        }
    }
    
}
