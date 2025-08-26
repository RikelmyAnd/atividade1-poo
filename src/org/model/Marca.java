package org.model;

import java.util.Date;

public class Marca {

    private long id;
    private String nome;
    private Modelo modelos;
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // CONSTRUTOR
    public Marca() {
    }

    public Marca(long id, String nome, Modelo modelos) {
        this.id = id;
        this.nome = nome;
        this.modelos = modelos;
    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // GET E SET

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Modelo getModelos() {
        return modelos;
    }

    public void setModelos(Modelo modelos) {
        this.modelos = modelos;
    }
}
