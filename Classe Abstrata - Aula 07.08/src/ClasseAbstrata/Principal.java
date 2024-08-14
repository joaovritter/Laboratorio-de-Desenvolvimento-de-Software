/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata;

/**
 *
 * @author João Capudo
 */
public class Principal {
    public static void main(String[] args) {
   
        CartaoCredito c = new CartaoCredito("Cartao de Credito", 12334,150);
        PayPal pp = new PayPal("PayPal", 0, 1);
        Pix pix = new Pix ("Pix", 0,1);
      
        c.processarPagamento(250);
        c.mostraDetalhePagamento();
        
        pp.processarPagamento(200);
        pp.mostraDetalhePagamento();
        
        pix.processarPagamento(150);
        pix.mostraDetalhePagamento();
    }
}
