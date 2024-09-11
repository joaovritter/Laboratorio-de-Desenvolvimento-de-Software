/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

/**
 *
 * @author laboratorio
 */
public class Revista extends ItemBiblioteca {
    protected String numeroEd, periodicidade;

    public Revista(String titulo, String autor, String anoPubli, String genero, String isbn, String numeroEd, String periodicidade) {
        super(titulo, autor, anoPubli, genero, isbn);
        this.numeroEd = numeroEd;
        this.periodicidade = periodicidade;
    }
    
    @Override
    public String executaAcao() {
        return "A revista "+ this.titulo +" foi inserido"; 
    }

    @Override
    public Object[] obterDados() {
        return new Object[] { titulo,  autor,  anoPubli,  genero,  isbn,  numeroEd,  periodicidade};
    }
}
