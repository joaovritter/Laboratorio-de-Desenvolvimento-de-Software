/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author João Capudo
 */
public class Professor extends Usuario {
    protected String matricula, areaFormacao,alocacao;
    
    public Professor(String nome, String dataNasc, String sexo, String cpf, String endereco, String matricula, String areaFormacao, String alocacao) {
        super(nome, dataNasc, sexo, cpf, endereco);
        this.matricula = matricula;
        this.areaFormacao = areaFormacao;
        this.alocacao = alocacao;
    }

    @Override
    public String executaAcao() { //String para pegar no JOptionPane e mostrar a mensagem
        return "O Professor "+ this.nome + " foi inserido";
    }
     public Object[] obterDados(){
         return new Object[] {nome, dataNasc,sexo, cpf, endereco, matricula,areaFormacao,alocacao};
    }
}
