/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo2;

/**
 *
 * @author laboratorio
 */
public class Disciplina {
    public static void main(String[] args){
        Professor p = new Professor();
        p.nome = "joao";
        
        Laboratorio l = new Laboratorio();
        l.local = "Predio 3";
        
        System.out.println("Professor: "+p.nome + "  Laboratorio: "+l.local);
    }
}
