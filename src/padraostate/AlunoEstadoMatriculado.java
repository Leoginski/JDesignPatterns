/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

import enumerable.EstadoAluno;

/**
 *
 * @author Leoginski
 */
public class AlunoEstadoMatriculado implements AlunoEstado {

    @Override
    public EstadoAluno getEstado() {
        return EstadoAluno.MATRICULADO;
    }

    @Override
    public EstadoAluno matricular() {
        throw new UnsupportedOperationException("Mizeraviu, no és possible!"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoAluno evadir() {
        return EstadoAluno.EVADIDO;
    }

    @Override
    public EstadoAluno formar() {
        return EstadoAluno.FORMADO;
    }

    @Override
    public EstadoAluno jubilar() {
        return EstadoAluno.JUBILADO;
    }

    @Override
    public EstadoAluno suspender() {
        return EstadoAluno.SUSPENSO;
    }

    @Override
    public EstadoAluno trancar() {
        return EstadoAluno.TRANCADO;
    }

}
