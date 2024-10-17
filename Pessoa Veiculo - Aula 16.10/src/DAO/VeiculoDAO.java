/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Conexao.Conexao;
import beans.Pessoa;
import beans.Veiculo;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laboratorio
 */
public class VeiculoDAO {
    private Conexao conexao;
    private Connection conn;

    public VeiculoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
     

    public void inserir (Veiculo veiculo){
        try {
            String sql = "INSERT INTO veiculo (modelo,pessoa,id_pessoa) VALUES (?,?,?)";
            
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,veiculo.getModelo());
            stmt.setString(2,veiculo.getPlaca()); 
            stmt.setInt(3,veiculo.getPessoaid().getId());
            stmt.execute(); 
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir veiculo: "+ex.getMessage());
        } 
    }
    public void editar (Veiculo veiculo){
        try {
            String sql = "UPDATE veiculo SET modelo=?, placa=?, id_pessoa=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, veiculo.getModelo());
            stmt.setString(2, veiculo.getPlaca());
            stmt.setInt(3, veiculo.getPessoaid().getId());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar veiculo: "+ex.getMessage());
                   
        } 
    }
    
    public void excluir (int id){
        try {
            String sql = "DELETE FROM veiculo WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir veiculo: "+ex.getMessage());
        }
        
    }
    
    public List<Veiculo> getVeiculos(){
        try {
            String sql = "SELECT * FROM veiculo";
            
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery();
            List<Veiculo> listaVeiculos = new ArrayList();
            
            while (rs.next()){
                Veiculo v = new Veiculo();
                v.setId(rs.getInt("id"));
                v.setModelo(rs.getString("modelo"));
                v.setPlaca(rs.getString("placa"));
                PessoaDAO pDAO = new PessoaDAO();
                
                Pessoa p = pDAO.getPessoa(rs.getInt("id_pessoa"));
                v.setPessoaid(p);
                listaVeiculos.add(v);
                
            }
            return listaVeiculos;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todas as pessoas: "+ex.getMessage());
            return null;
        }
        
    }
    
     public Veiculo getVeiculo (int id){
         String sql = "SELECT * FROM veiculo WHERE id=?";
         try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            stmt.setInt(1,id);
          
            ResultSet rs = stmt.executeQuery();
            Veiculo v = new Veiculo();
            rs.first();
            v.setId(rs.getInt("id"));
            v.setModelo(rs.getString("modelo"));
            v.setPlaca(rs.getString("placa"));
            PessoaDAO pDAO = new PessoaDAO();
            Pessoa p = pDAO.getPessoa(rs.getInt("id_pessoa"));
            v.setPessoaid(p);  
            
            return v; 
            
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todas as pessoas: "+ex.getMessage());
            return null;
        }
        
    }
}

