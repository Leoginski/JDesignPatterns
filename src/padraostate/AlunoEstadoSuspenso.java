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
public class AlunoEstadoSuspenso implements AlunoEstado {

    @Override
    public EstadoAluno getEstado() {
        return EstadoAluno.SUSPENSO;
    }

    @Override
    public EstadoAluno matricular() {
        return EstadoAluno.MATRICULADO;
    }

    @Override
    public EstadoAluno evadir() {
        throw new UnsupportedOperationException("Mizeraviu, no és possible!"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoAluno formar() {
        throw new UnsupportedOperationException("Mizeraviu, no és possible!"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoAluno jubilar() {
        throw new UnsupportedOperationException("Mizeraviu, no és possible!"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoAluno suspender() {
        throw new UnsupportedOperationException("Mizeraviu, no és possible!"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadoAluno trancar() {
        throw new UnsupportedOperationException("Mizeraviu, no és possible!"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
