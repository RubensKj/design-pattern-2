package com.rubenskj.pattern.visitor;

import com.rubenskj.pattern.interpreter.*;

public class ImpressoraVisitor implements Visitor {

    @Override
    public void visitaSoma(Soma soma) {
        System.out.print("(");

        // esquerda
        soma.getEsquerda().aceita(this);

        System.out.print(" + ");

        // direita
        soma.getDireita().aceita(this);

        System.out.print(")");
    }

    @Override
    public void visitaSubtracao(Subtracao subtracao) {
        System.out.print("(");

        // esquerda
        subtracao.getEsquerda().aceita(this);

        System.out.print(" - ");

        // direita
        subtracao.getDireita().aceita(this);

        System.out.print(")");
    }

    @Override
    public void visitaMultiplicacao(Multiplicacao multiplicacao) {
        System.out.print("(");

        // esquerda
        multiplicacao.getEsquerda().aceita(this);

        System.out.print(" * ");

        // direita
        multiplicacao.getDireita().aceita(this);

        System.out.print(")");
    }

    @Override
    public void visitaDivisao(Divisao divisao) {
        System.out.print("(");

        // esquerda
        divisao.getEsquerda().aceita(this);

        System.out.print(" / ");

        // direita
        divisao.getDireita().aceita(this);

        System.out.print(")");
    }

    @Override
    public void visitaRaizQuadrada(RaizQuadrada raizQuadrada) {
        System.out.print("sqrt(");
        raizQuadrada.getExpressao().aceita(this);
        System.out.print(")");
    }

    @Override
    public void visitaNumero(Numero numero) {
        System.out.print(numero.getNumero());
    }
}
