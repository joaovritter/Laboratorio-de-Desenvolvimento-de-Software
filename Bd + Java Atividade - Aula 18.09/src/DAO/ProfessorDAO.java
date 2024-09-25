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
            stmt.setString(3, professor.getDiciplina());
        
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir professor: " + ex.getMessage());
        }
        
    }
    
}
