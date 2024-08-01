/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo4;

/**
 *
 * @author laboratorio
 */
public class Livro {
    private String titulo, autor;
    private int anoPubli;
    
    @Override
    public String toString()  {
        return "titulo: "+this.getTitulo()+ "\nAutor: "+this.getAutor()+ "\n ano publicacao: "+this.getAnoPubli();
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the anoPubli
     */
    public int getAnoPubli() {
        return anoPubli;
    }

    /**
     * @param anoPubli the anoPubli to set
     */
    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }

   
    
}
