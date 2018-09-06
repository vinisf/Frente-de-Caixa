/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalhoJava.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.trabalhoJava.ClassesBeans.Produtos;
import br.com.trabalhoJava.Conexão.ModuloConexao;

/**
 *
 * @author Vinicius
 */
public class ProdutoDao {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public ProdutoDao() throws SQLException {
        conexao = ModuloConexao.conector();

    }

    public void adicionar(Produtos p) throws SQLException {
        if (p.getNome().isEmpty() || p.getCategoria().isEmpty() || String.valueOf(p.getPreco()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "CAMPO OBRIGATORIO NAO INFORMADO!");
        } else {
            try {

                pst = conexao.prepareStatement("insert into produto(categoria,nome,preco) values (?, ?,?)");
                pst.setString(1, p.getCategoria());
                pst.setString(2, p.getNome());
                pst.setFloat(3, p.getPreco());

                int adicionado = pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Produto Adicionado!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                conexao.close();
            }
        }
    }

    public void alterar(Produtos p) {

        try {
            pst = conexao.prepareStatement("update produto set categoria=?, preco=?, nome=? where idProd=?");

            pst.setString(1, p.getCategoria());
            pst.setString(3, p.getNome());
            pst.setFloat(2, p.getPreco());
            pst.setInt(4, p.getIdProd());

            int alterado = pst.executeUpdate();
            if (alterado > 0) {

                JOptionPane.showMessageDialog(null, "ALterado com sucesso!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar: " + ex);
        } finally {

        }

    }

    public void delete(Produtos p) {

        try {
            pst = conexao.prepareStatement("DELETE FROM produto WHERE idProd = ?");
            pst.setInt(1, p.getIdProd());

            int deletado = pst.executeUpdate();
            if (deletado > 0) {

                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {

        }

    }
    //Lista para adicionar dados na tabela

    public List<Produtos> ler() throws SQLException {

        List<Produtos> prodlist = new ArrayList<>();

        try {
            pst = conexao.prepareStatement("select * from produto ");
            rs = pst.executeQuery();

            while (rs.next()) {
                Produtos p = new Produtos();
                p.setIdProd(rs.getInt("idProd"));
                p.setCategoria(rs.getString("categoria"));
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getFloat("preco"));
                prodlist.add(p);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {//conexao.close();}

        }
        return prodlist;

    }

    //List para pesquisar na tblProduto
    public List<Produtos> lerpesquisa(String pesq) throws SQLException {

        List<Produtos> prodlist = new ArrayList<>();

        try {
            pst = conexao.prepareStatement("select * from produto where nome like ? ");
            pst.setString(1, "%" + pesq + "%");
            rs = pst.executeQuery();

            while (rs.next()) {
                Produtos p = new Produtos();
                p.setIdProd(rs.getInt("idProd"));
                p.setCategoria(rs.getString("categoria"));
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getFloat("preco"));
                prodlist.add(p);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {

        }
        return prodlist;

    }

}
