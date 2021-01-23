package com.rubenskj.pattern.command;

import java.util.Calendar;

public class Pedido {

    private String cliente;
    private double valor;
    private Status status;
    private Calendar dataFinalizacao;

    public Pedido(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.status = Status.NOVO;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void paga() {
        this.status = Status.PAGO;
    }

    public void finaliza() {
        this.dataFinalizacao = Calendar.getInstance();
        this.status = Status.ENTREGUE;
    }
}
