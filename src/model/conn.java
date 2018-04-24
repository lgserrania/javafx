/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author CLIENTE
 */
public class conn {
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String stringConexao = "jdbc:mysql://localhost/teste?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String user = "root";
    private String pass = "";
    
    public Connection conexao;
    
    public conn(){
        conectar();
    }
    
    public void conectar(){
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(stringConexao, user, pass);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public void desconectar(){
        try{
            conexao.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
