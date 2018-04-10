/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Leoginski
 */
public class Departamento {

    private int id;
    private String nome;

    public Departamento() {
    }

    public Departamento(int id) {
        this.id = id;
    }

    public Departamento(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}