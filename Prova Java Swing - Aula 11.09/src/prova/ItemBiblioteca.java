/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

/**
 *
 * @author laboratorio
 */
public abstract class ItemBiblioteca {
    protected String titulo, autor, anoPubli, genero, isbn;

    public ItemBiblioteca(String titulo, String autor, String anoPubli, String genero, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubli = anoPubli;
        this.genero = genero;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAnoPubli() {
        return anoPubli;
    }
    public void setAnoPubli(String anoPubli) {
        this.anoPubli = anoPubli;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public abstract String executaAcao ();
    
    public abstract Object[] obterDados();
}
