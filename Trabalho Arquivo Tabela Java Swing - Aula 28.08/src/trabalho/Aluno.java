/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho;

/**
 *
 * @author laboratorio
 */
 public class Aluno {

    /**
     * @param args the command line arguments
     */
    protected String nome;
    protected String dataNasc;
    protected String sexo;
    protected String matricula;
   

    public Aluno(String nome, String dataNasc, String sexo, String matricula) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.matricula = matricula;
      
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", dataNasc=" + dataNasc + ", sexo=" + sexo + ", matricula=" + matricula;
    }
    
    public Object[] obterDados(){
        return new Object[] {nome,dataNasc,sexo,matricula};
    }
    
}
