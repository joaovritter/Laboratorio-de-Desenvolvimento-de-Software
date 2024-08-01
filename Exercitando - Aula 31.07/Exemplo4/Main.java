/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exemplo4;

/**
 *
 * @author laboratorio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Livro l = new Livro();
        l.setTitulo("chupa cu");
        l.setAutor("Joao saraiva");
        l.setAnoPubli(1500);
        
    
        System.out.println("Livro: " +l.toString());
    
    }
    
}
