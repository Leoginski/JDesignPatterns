/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

import enumerable.EstadoAluno;
import model.Aluno;

/**
 *
 * @author Leoginski
 */
public class AlunoEstadoTrancado implements AlunoEstado {

    @Override
    public EstadoAluno getEstado() {
        return EstadoAluno.TRANCADO;
    }

    @Override
    public void matricular(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoMatriculado());
        System.out.println("O ALUNO MATRICULOU");
    }

    @Override
    public void evadir(Aluno aluno) {
        System.out.println("O ALUNO NÃO FOI EVADIDO");
    }

    @Override
    public void formar(Aluno aluno) {
        System.out.println("O ALUNO NÃO FORMOU");
    }

    @Override
    public void jubilar(Aluno aluno) {
        System.out.println("O ALUNO NÃO FOI JUBILADO");
    }

    @Override
    public void suspender(Aluno aluno) {
        System.out.println("O ALUNO NÃO FOI SUSPENSO");
    }

    @Override
    public void trancar(Aluno aluno) {
        System.out.println("O ALUNO JÁ ESTÁ TRANCADO");
    }
}
