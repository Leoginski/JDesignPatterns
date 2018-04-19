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
public class PromocaoQueimaEstoque implements Promocao {

    @Override
    public int obterDesconto() {
        return 30;
    }

    @Override
    public String obterPromocao() {
        return "Queima de Estoque";
    }

}
