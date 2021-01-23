package com.rubenskj.pattern.command;

public class ConcluiPedido implements Comando {

    private Pedido pedido;

    public ConcluiPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executa() {
        System.out.println("Concluindo pedido do cliente: " + pedido.getCliente());
        pedido.finaliza();
    }
}
