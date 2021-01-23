package com.rubenskj.pattern.command;

public class Programa {

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Mauricio", 150.0);
        Pedido pedido2 = new Pedido("Marcelo", 250.0);

        FilaDeTrabalho filaDeTrabalho = new FilaDeTrabalho();

        filaDeTrabalho.adiciona(new PagaPedido(pedido1));
        filaDeTrabalho.adiciona(new PagaPedido(pedido2));
        filaDeTrabalho.adiciona(new ConcluiPedido(pedido1));

        filaDeTrabalho.processa();
    }
}
