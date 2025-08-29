package org.model;

public class Pagamento {
    private long id;
    private TIPOPAGAMENTO tipoPagamento;
    private float valorTotal;

    public Pagamento() {
    }

    public Pagamento(long id, TIPOPAGAMENTO tipoPagamento, float valorTotal) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.valorTotal = valorTotal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TIPOPAGAMENTO getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TIPOPAGAMENTO tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}

