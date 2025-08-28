package org.model;

public class Categoria {
    private long id;
    private String nome;
    private float valorLocacao;
    private Modelo modelos;

    public Categoria() {
    }

    public Categoria(long id, String nome, float valorLocacao, Modelo modelos) {
        this.id = id;
        this.nome = nome;
        this.valorLocacao = valorLocacao;
        this.modelos = modelos;
    }

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

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public Modelo getModelos() {
        return modelos;
    }

    public void setModelos(Modelo modelos) {
        this.modelos = modelos;
    }


}
