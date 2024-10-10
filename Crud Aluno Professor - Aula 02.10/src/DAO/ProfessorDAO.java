/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import beans.Professor;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLClientInfoException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 *  DAO = Data Access Object ou Objeto de Acesso aos Dados
 *  A classe AlunoDAO é responsável persistir os dados
(inserção, edição, exclusão e pesquisa) da aplicação nas tabelas.
 Resumindo, é ela que executará os códigos SQL no banco.
É importante que tenhamos também um DAO para cada tabela.
 * @author laboratorio
 */
public class ProfessorDAO {
    private Conexao conexao;
    private Connection conn;

    public ProfessorDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Professor professor){
        String sql = "INSERT INTO Aluno (nome, idade, diciplina) VALUES (?,?,?)";
        
        PreparedStatement stmt;
        try {
            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getIdade());
            stmt.setString(3, professor.getDisciplina());
        
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir professor: " + ex.getMessage());
        }
        
    }
    public Professor getProfessor (int id){
        String sql = "SELECT * FROM Professor WHERE id = ?";
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
            Professor p = new Professor();//Preparo um objeto que vou armazenar a consulta
            //Primeiramente, vamos posicionar o retorno da consulta (ResultSet) na primeira posição da consulta
            //Em alguns casos, a consulta terá mais de um resultado de retorno
            rs.first();
            p.setId(id);
            p.setNome(rs.getString("nome"));
            p.setIdade (rs.getString("idade"));
            p.setDisciplina(rs.getString("disciplina"));
            return p;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar pessoa:" + ex.getMessage());
            return null;
        }
    }
    public void editar (Professor professor){
        try {
            String sql = "UPDATE PROFESSOR SET nome=?, idade=?, disciplina=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString (1,professor.getNome());
            stmt.setString (2,professor.getIdade());
            stmt.setString (3,professor.getDisciplina());
            stmt.setInt (4,professor.getId());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar  professor: "+ex.getMessage());
        }
    }
    
    public void excluir (int id){
        try {
            String sql = "DELETE FROM PROFESSOR WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir professor: "+ ex.getMessage());
        }
        
    }
    
}
