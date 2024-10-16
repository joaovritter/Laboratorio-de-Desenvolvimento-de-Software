/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 * no pacote beans temos a classe Professor que mapeia a tabela do banco de
dados, ou seja, a classe tem como atributos as colunas da tabela. 
 * @author Admin
 */
public class Professor {
    private int id;
    private String nome;
    private String idade;
    private String diciplina;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getDisciplina() {
        return diciplina;
    }

    public void setDisciplina(String diciplina) {
        this.diciplina = diciplina;
    }
    
    
}
