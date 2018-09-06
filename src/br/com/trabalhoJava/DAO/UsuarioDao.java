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
import javax.swing.JOptionPane;
import br.com.trabalhoJava.ClassesBeans.Usuario;
import br.com.trabalhoJava.Telas.TelaPrincipal;
import java.util.ArrayList;
import java.util.List;
import br.com.trabalhoJava.Conexão.ModuloConexao;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinicius
 */
public class UsuarioDao {

    Connection conexao;
    PreparedStatement pst;
    ResultSet rs;
    boolean check = false;

    public UsuarioDao() {
        try {
            conexao = ModuloConexao.conector();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean logar(String login, String senha) {

        try {
            /*As linhas abaixo preparam o banco de dados em função do que foi
            digitado na caixa de texto.
            O ? é substituido pelo conteudo das variaveis*/
            Usuario user = new Usuario();
            pst = conexao.prepareStatement("select * from usuario where login=? and senha=?");
            pst.setString(1, login);
            pst.setString(2, senha);
            rs = pst.executeQuery();
            //se existir login e senha correspondente acessa a tela principal
            if (rs.next()) {
                // O campo abaixo obtem o conteudo do campo perfil na tabela usuario
                check = true;
                user.setPerfil(rs.getString(5));
                if (user.getPerfil().equals("Admin")) {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.menCadFun.setEnabled(true);
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));

                } else {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));

                }

            } else {
                JOptionPane.showMessageDialog(null, "Login e/ou Senha invalido!");

            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "erro:" + e);
        }
        return check;

    }

    public void adicionar(Usuario user) {
        if (user.getCpf().isEmpty() || user.getNome().isEmpty() || user.getLogin().isEmpty() || user.getSenha().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Para Cadastrar preencha todos os campos!");
        } else {
            try {
                pst = conexao.prepareStatement("insert into usuario (cpf,nome,senha, login,perfil) values (?,?,?,?,?)");
                pst.setString(1, user.getCpf());
                pst.setString(2, user.getNome());
                pst.setString(3, user.getSenha());
                pst.setString(4, user.getLogin());
                pst.setString(5, user.getPerfil());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario Adicionado!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

    }

    public void deletar(Usuario user) {
        if (user.getCpf().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Para deletar preencha o campo cpf !");
        } else {
            try {
                pst = conexao.prepareStatement("delete from usuario where cpf=?");
                pst.setString(1, user.getCpf());
                int deletado = pst.executeUpdate();
                if (deletado > 0) {

                    JOptionPane.showMessageDialog(null, "Usuario Deletado!");

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario Não Existe!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }

    public void alterar(Usuario user) {
        if (user.getCpf().isEmpty() || user.getNome().isEmpty() || user.getLogin().isEmpty() || user.getSenha().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Para Aletrar preencha todos os campos!");
        } else {
            try {
                pst = conexao.prepareStatement("update usuario set nome=?,senha=?, login=?, perfil=? where cpf=?");
                pst.setString(5, user.getCpf());
                pst.setString(1, user.getNome());
                pst.setString(2, user.getSenha());
                pst.setString(3, user.getLogin());
                pst.setString(4, user.getPerfil());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario alterado!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public List<Usuario> ler() {
        List<Usuario> userlist = new ArrayList<>();

        try {
            pst = conexao.prepareStatement("select * from usuario");
            rs = pst.executeQuery();
            while (rs.next()) {
                Usuario user = new Usuario();
                user.setNome(rs.getString("nome"));
                userlist.add(user);

            }
        } catch (Exception e) {
        }
        return userlist;

    }

    public List<Usuario> lerLogin() {
        List<Usuario> userlist = new ArrayList<>();

        try {
            pst = conexao.prepareStatement("select * from usuario");
            rs = pst.executeQuery();
            while (rs.next()) {
                Usuario user = new Usuario();
                user.setLogin(rs.getString("login"));
                userlist.add(user);

            }
        } catch (Exception e) {
        }
        return userlist;

    }

    public void consultar(Usuario user) {

        try {
            pst = conexao.prepareStatement("select * from usuario where nome = ? ");
            pst.setString(1, user.getNome());
            rs = pst.executeQuery();
            if (rs.next()) {
                user.setCpf(rs.getString(1));
                user.setSenha(rs.getString(3));
                user.setLogin(rs.getString(4));
                user.setPerfil(rs.getString(5));
            }
        } catch (Exception e) {
        }
    }

}
