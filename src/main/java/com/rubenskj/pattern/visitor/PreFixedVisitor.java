package com.rubenskj.pattern.visitor;

import com.rubenskj.pattern.interpreter.*;

public class PreFixedVisitor implements Visitor {

    @Override
    public void visitaSoma(Soma soma) {
        System.out.print("+ ");

        soma.getEsquerda().aceita(this);

        System.out.print(" ");

        soma.getDireita().aceita(this);
    }

    @Override
    public void visitaSubtracao(Subtracao subtracao) {

        System.out.print("- ");

        subtracao.getEsquerda().aceita(this);

        System.out.print(" ");

        subtracao.getDireita().aceita(this);
    }

    @Override
    public void visitaMultiplicacao(Multiplicacao multiplicacao) {

        System.out.print("* ");

        multiplicacao.getEsquerda().aceita(this);

        System.out.print(" ");

        multiplicacao.getDireita().aceita(this);
    }

    @Override
    public void visitaDivisao(Divisao divisao) {

        System.out.print("/ ");

        divisao.getEsquerda().aceita(this);

        System.out.print(" ");

        divisao.getDireita().aceita(this);
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
