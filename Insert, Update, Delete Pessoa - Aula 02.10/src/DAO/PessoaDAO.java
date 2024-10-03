/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import beans.Pessoa;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLClientInfoException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *  -DAO = Data Access Object ou Objeto de Acesso aos Dados
 *  -A classe AlunoDAO é responsável persistir os dados
 *  (inserção, edição, exclusão e pesquisa) da aplicação nas tabelas.
 *  -Resumindo, é ela que executará os códigos SQL no banco.
 *  -É importante que tenhamos também um DAO para cada tabela.
 * @author laboratorio
 */
public class PessoaDAO {
    private Conexao conexao;
    private Connection conn;

    public PessoaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Pessoa pessoa){
        String sql = "INSERT INTO PESSOA (nome, sexo, idioma) VALUES (?,?,?)";
        
        PreparedStatement stmt;
        try {
            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());
        
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir pessoa: " + ex.getMessage());
        }
        
    }
    
    public Pessoa getPessoa (int id){
        String sql = "SELECT * FROM PESSOA WHERE id = ?";
        PreparedStatement stmt;
        try {
            stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            /*1º parametro é o sql
            2º parametro é o tipo do ResultSet -
            ResultSet scroll, ou seja, o cursor se move para frente ou para trás
            Este tipo de ResultSet é sensível às alterações feitas no banco de dados, ou seja,
            as modificações feitas no banco de dados são refletidas no ResultSet.
            3º parametro é sobre os parametros de concorrencia - pode ser "read only" ou atualizavel
            */
            stmt.setInt (1,id);
            ResultSet rs = stmt.executeQuery(); //obtenho o retorno da consulta e armazeno no ResultSet
            Pessoa p = new Pessoa();//Preparo um objeto que vou armazenar a consulta
            //Primeiramente, vamos posicionar o retorno da consulta (ResultSet) na primeira posição da consulta
            //Em alguns casos, a consulta terá mais de um resultado de retorno
            rs.first();
            p.setId(id);
            p.setNome(rs.getString("nome"));
            p.setSexo (rs.getString("sexo"));
            p.setIdioma(rs.getString("idioma"));
            return p;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar pessoa:" + ex.getMessage());
            return null;
        }
    }
    public void editar (Pessoa pessoa){
        try {
            String sql = "UPDATE PESSOA SET nome=?, sexo=?, idioma=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString (1,pessoa.getNome());
            stmt.setString (2,pessoa.getSexo());
            stmt.setString (3,pessoa.getIdioma());
            stmt.setInt (4,pessoa.getId());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar  pessoa: "+ex.getMessage());
        }
    }
    
    public void excluir (int id){
        try {
            String sql = "DELETE FROM PESSOA WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir pessoa: "+ ex.getMessage());
        }
        
    }
        
}
    
