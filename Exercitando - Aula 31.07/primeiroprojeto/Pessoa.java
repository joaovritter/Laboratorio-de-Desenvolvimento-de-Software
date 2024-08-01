/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiroprojeto;

/**
 *
 * @author laboratorio
 */
public class Pessoa {
    private String nome;
    private String email;
    private int idade;
    
    @Override
    public String toString()  {
        return "Nome: "+this.getNome()+ "\nIdade: "+this.getIdade()+ "\nEmail: "+this.getEmail();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
