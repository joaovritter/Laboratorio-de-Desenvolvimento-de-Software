/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexao {
    public Connection getConexao(){
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bdaula01?useTimeZone=true&serverTimeZone=UTC",
                    "root", "laboratorio");
            System.out.println("Conectado com exito!!");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}