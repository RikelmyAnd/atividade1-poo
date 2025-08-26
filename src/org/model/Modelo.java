package org.model;

import java.util.Date;

public class Modelo {
    private long id;
    private  String nome;
    private String descricao;
    private Date data;
    private int qtModelo;

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // CONSTRUTOR
    public Modelo() {
        this.id = 0;
        this.nome = "";
        this.descricao="";
        this.data = new Date();
        this.qtModelo = 0;
    }

    public Modelo(long id, String nome, String descricao, Date data, int qtModelo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.qtModelo = qtModelo;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQtModelo() {
        return qtModelo;
    }

    public void setQtModelo(int qtModelo) {
        this.qtModelo = qtModelo;
    }
}
