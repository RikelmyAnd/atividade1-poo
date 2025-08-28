package org.model;

import java.awt.*;
import java.util.Date;

public class Locacao {
    private long id;
    private Date dataRetirada;
    private Date dataDevolucao;
    private float valorLocacao;
    private List Ocorrencia;
    private Veiculo veiculo;

    public Locacao() {
    }

    public Locacao(long id, Date dataRetirada, Date dataDevolucao, float valorLocacao, List ocorrencia, Veiculo veiculo) {
        this.id = id;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.valorLocacao = valorLocacao;
        Ocorrencia = ocorrencia;
        this.veiculo = veiculo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public List getOcorrencia() {
        return Ocorrencia;
    }

    public void setOcorrencia(List ocorrencia) {
        Ocorrencia = ocorrencia;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
