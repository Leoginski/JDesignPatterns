/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerable;

/**
 *
 * @author Leoginski
 */
public enum EstadoAluno {
    MATRICULADO(1), TRANCADO(2), SUSPENSO(3), EVADIDO(4), JUBILADO(5), FORMADO(6);

    public int valor;

    EstadoAluno(int valor) {
        this.valor = valor;
    }
}
