/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import beans.Aluno;
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
public class AlunoDAO {
    private Conexao conexao;
    private Connection conn;

    public AlunoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Aluno aluno){
        String sql = "INSERT INTO Aluno (nome, idade, curso) VALUES (?,?,?)";
        
        PreparedStatement stmt;
        try {
            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getIdade());
            stmt.setString(3, aluno.getCurso());
        
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir aluno: " + ex.getMessage());
        }
        
    }
    public Aluno getAluno (int id){
        String sql = "SELECT * FROM ALUNO WHERE id = ?";
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
            Aluno p = new Aluno();//Preparo um objeto que vou armazenar a consulta
            //Primeiramente, vamos posicionar o retorno da consulta (ResultSet) na primeira posição da consulta
            //Em alguns casos, a consulta terá mais de um resultado de retorno
            rs.first();
            p.setId(id);
            p.setNome(rs.getString("nome"));
            p.setIdade (rs.getString("idade"));
            p.setCurso(rs.getString("curso"));
            return p;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar aluno:" + ex.getMessage());
            return null;
        }
    }
    public void editar (Aluno aluno){
        try {
            String sql = "UPDATE PESSOA SET nome=?, idade=?, curso=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString (1,aluno.getNome());
            stmt.setString (2,aluno.getIdade());
            stmt.setString (3,aluno.getCurso());
            stmt.setInt (4,aluno.getId());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar  aluno: "+ex.getMessage());
        }
    }
    
    public void excluir (int id){
        try {
            String sql = "DELETE FROM ALUNO WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir aluno: "+ ex.getMessage());
        }
        
    }
    
}