/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata;

/**
 *
 * @author João Capudo
 */
public class Pix extends MetodoPagamento {
    public double valor;
      public Pix(String nomeMetodo, int idPagamento, double valor) {
        super(nomeMetodo, idPagamento);
        this.valor= valor;
    }

   @Override
    public double processarPagamento(double valor) {
        System.out.println("Processado o Pagamento em "+this.nomeMetodo+ " no valor de R$"+this.valor);
        return valor;
    }

    @Override
    public void mostraDetalhePagamento() {
        System.out.println("Pagamento no metodo "+this.nomeMetodo+ " Id de Pagamento: "+this.idPagamento);
    }
    
}
