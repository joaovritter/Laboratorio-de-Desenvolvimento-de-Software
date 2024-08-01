/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiroprojeto;

/**
 *
 * @author laboratorio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Oi");
        Pessoa p = new Pessoa();
        p.setNome("joao");
        p.setIdade(20);
        p.setEmail("joao@joao.com");
        
        Pessoa p2 = new Pessoa();
        p2.setIdade(1);
        
        Pessoa p3 = new Pessoa();
        p3.setIdade(313313);
        System.out.println("Dados Da Pessoa: " +p.toString());
        System.out.println("Pessoa 2: "+p2.toString());
        System.out.println("Pessoa 3: "+p3.toString());
    }
    
}
