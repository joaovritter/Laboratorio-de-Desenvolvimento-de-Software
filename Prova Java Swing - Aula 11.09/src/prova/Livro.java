/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

/**
 *
 * @author laboratorio
 */
public class Livro extends ItemBiblioteca {
    protected String numeroPg, editora;

    public Livro(String titulo, String autor, String anoPubli, String genero, String isbn, String editora, String numeroPg ) {
        super(titulo, autor, anoPubli, genero, isbn);
        this.numeroPg = numeroPg;
        this.editora = editora;
    }
    
    @Override
    public String executaAcao() {
        return "O livro "+ this.titulo +" foi inserido";
    }

    @Override
    public Object[] obterDados() {
        return new Object[] {titulo,  autor,  anoPubli,  genero,  isbn,  editora,  numeroPg};
    }
}
