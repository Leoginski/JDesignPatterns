/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Leoginski
 */
public abstract class Produto {

    protected String nome;
    protected Promocao promocao;
    protected Impressao impressao;

    public int desconto() {
        return promocao.obterDesconto();
    }
    
    public String getNome() {
        return nome;
    }

    public String getPromocao() {
        return promocao.obterPromocao();
    }

    public String getTipoImpressao() {
        return impressao.imprimir();
    }
}
