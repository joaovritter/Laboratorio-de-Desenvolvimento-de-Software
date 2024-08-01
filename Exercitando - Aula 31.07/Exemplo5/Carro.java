/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo5;

/**
 *
 * @author laboratorio
 */
public class Carro {
    private String marca;
    private String modelo;
  
   public Carro(String marca){
       this.marca=marca;
     
   } 
   public Carro(String marca, String modelo){
       this.marca=marca;
       this.modelo=modelo;
   }
    
    public void alugar(){
        System.out.println("Alugado: " + this.getMarca() + " "+this.getModelo());
    }
    public void devolver(){
        System.out.println("Devolvido: " + this.getMarca() + " "+this.getModelo());
    }
    public void dados(){
        System.out.println("Carro: " + this.getMarca() + "  Modelo:"+this.getModelo());
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
