/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClasseAbstrata;

import java.util.Random;

/**
 * Classe abstrata que contem o metodo de pagamento e seu id
 * @author João
 */
public abstract class MetodoPagamento {
      protected String nomeMetodo;
      protected int idPagamento;

    public MetodoPagamento(String nomeMetodo, int idPagamento) {
        this.nomeMetodo = nomeMetodo;
        this.idPagamento = gerarIdPagamento();
    }
      
    public int gerarIdPagamento(){
        Random gerador = new Random();
        return gerador.nextInt(20);
    }
    
      public abstract double processarPagamento (double valor);
       
     public abstract void mostraDetalhePagamento();
  
    
}
