/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalhoJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.trabalhoJava.ClassesBeans.Pedido;
import br.com.trabalhoJava.Conexão.ModuloConexao;

/**
 *
 * @author Vinicius
 */
public class PedidoDao {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public PedidoDao() throws SQLException{
        conexao = ModuloConexao.conector();
    }
   
}
