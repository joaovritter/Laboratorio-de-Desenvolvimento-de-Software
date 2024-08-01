/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo3;

/**
 *
 * @author laboratorio
 */
public class Pessoa {
    private String nome;
    private String genero;
    private int idade;
    
    @Override
    public String toString()  {
        return "Nome: "+this.getNome()+ "\nIdade: "+this.getIdade()+ "\nGenero: "+this.getGenero();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
