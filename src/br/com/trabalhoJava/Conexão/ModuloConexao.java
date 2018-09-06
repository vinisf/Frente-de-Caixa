/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalhoJava.Conexão;

/**
 *
 * @author Vinicius
 */
import java.sql.*;

public class ModuloConexao {
    //Metodo responsavel por estabelecer a conexão com o BD

    public static Connection conector() throws SQLException {
        java.sql.Connection conexao = null;
        // A linha abaixo chama o driver
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando informações referente ao BD
        String url = "jdbc:mysql://localhost:3306/foodtruck";
        String user = "root";
        String password = "";
        
        // Estabelecendo a conexão com o BD
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        /*finally{
        conexao.close();
        }*/
    }
}
