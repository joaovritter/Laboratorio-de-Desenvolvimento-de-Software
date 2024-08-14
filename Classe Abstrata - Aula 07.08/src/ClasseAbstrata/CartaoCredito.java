/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata;

/**
 * Classe cartao de credito que possui os atributos nomeMetodo e idPagamento
 * herdados da super classe.
 * @author João Capudo
 */
public class CartaoCredito extends MetodoPagamento {
   
    public double valor;
    
    public CartaoCredito(String nomeMetodo, int idPagamento, double valor) {
        super(nomeMetodo, idPagamento);
        this.valor = valor;
    }

     /***
     * metodo que processa o pagamento retornando o valor e uma mensagem
     * @param valor - valor do pagamento
     * @param nomeMetodo - nome do metodo de pagamento
     */
    @Override
    public double processarPagamento(double valor) {
        System.out.println("Processado o Pagamento em "+this.nomeMetodo+ " no valor de R$"+this.valor);
        return valor;
    }

    /***
     * metodo que mostra os detalhes do pagamento com o nome do metodo de pagamento e seu id
     * @param nomeMetodo - nome do metodo de pagamento
     * @param idPagamento - identificador de pagamento gerado aleatoriamente
     */
    @Override
    public void mostraDetalhePagamento() {
        System.out.println("Pagamento no metodo "+this.nomeMetodo+ " Id de Pagamento: "+this.idPagamento);
    }
    
}
