/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class Principal {
    public static void main(String[] args) {
        
    
    Aluno a1 = new Aluno("joao","17/07/2004","Masculino","213131"); 
    List<Aluno> listaAlunos = new ArrayList<Aluno>();
        
    for (Aluno a : listaAlunos) {
        System.out.println(listaAlunos.toString());
    }
    
    }
}