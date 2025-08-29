package org.model;

import java.awt.*;
import java.util.Date;

public class ContratoLocacao {
    private long id;
    private Date dataContrato;
    private float valorLocacao;
    private STATUSLOCAÇÃO status;
    private List listlocacao;
    private float valorTotal;
    private Funcionario funcionario;
    private Cliente cliente;

    public ContratoLocacao() {
    }

    public ContratoLocacao(long id, Date dataContrato, float valorLocacao, STATUSLOCAÇÃO status, List listlocacao, float valorTotal, Funcionario funcionario, Cliente cliente) {
        this.id = id;
        this.dataContrato = dataContrato;
        this.valorLocacao = valorLocacao;
        this.status = status;
        this.listlocacao = listlocacao;
        this.valorTotal = valorTotal;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public STATUSLOCAÇÃO getStatus() {
        return status;
    }

    public void setStatus(STATUSLOCAÇÃO status) {
        this.status = status;
    }

    public List getListlocacao() {
        return listlocacao;
    }

    public void setListlocacao(List listlocacao) {
        this.listlocacao = listlocacao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
