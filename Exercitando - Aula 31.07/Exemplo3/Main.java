/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exemplo3;

/**
 *
 * @author laboratorio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pessoa p = new Pessoa();
        p.setNome("joao");
        p.setIdade(20);
        p.setGenero("Macho alfa");
        
    
        System.out.println("Dados Da Pessoa: " +p.toString());
    
    }
    
}
