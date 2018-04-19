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
public class PromocaoNatal implements Promocao{

    @Override
    public int obterDesconto() {
        return 10;
    }

    @Override
    public String obterPromocao() {
        return "Natal";
    }
    
}