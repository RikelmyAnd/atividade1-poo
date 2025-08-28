package org.model;

public class Pagamento {
    private long id;
    private enum tipoPagamento  {
        CARTAO,PIX,DINHEIRO
    }
    private float valorTotal;

    public Pagamento() {
    }

    public Pagamento(long id, float valorTotal) {
        this.id = id;
        this.valorTotal = valorTotal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}

