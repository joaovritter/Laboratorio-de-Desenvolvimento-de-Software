/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author João Capudo
 */
public class Aluno extends Usuario {
    protected String matricula, curso;
    
    public Aluno(String nome, String dataNasc, String sexo, String cpf, String endereco, String matricula, String curso) {
        super(nome, dataNasc, sexo, cpf, endereco);
        this.matricula = matricula;
        this.curso = curso;
      
    }

    @Override
    public String executaAcao() { //String para pegar no JOptionPane e mostrar a mensagem
        return "O Aluno "+ this.nome + " foi inserido";
    }
    
    public Object[] obterDados(){
         return new Object[] {nome, dataNasc,sexo, cpf, endereco, matricula, curso,};
    }
}
