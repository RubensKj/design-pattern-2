package com.rubenskj.pattern.interpreter;

import com.rubenskj.pattern.visitor.ImpressoraVisitor;
import com.rubenskj.pattern.visitor.PreFixedVisitor;

public class Programa {

    public static void main(String[] args) {

        Expressao esquerda = new Subtracao(new Multiplicacao(new Numero(5), new Numero(7)), new Numero(5));
        Expressao direita = new Soma(new Divisao(new Numero(6), new Numero(2)), new RaizQuadrada(new Numero(16)));

        Expressao soma = new Soma(esquerda, direita);

        int resultado = soma.avalia();

        ImpressoraVisitor impressoraVisitor = new ImpressoraVisitor();
        soma.aceita(impressoraVisitor);

        System.out.println("");
        System.out.println("===== PRE FIXED =====");

        PreFixedVisitor preFixedVisitor = new PreFixedVisitor();

        soma.aceita(preFixedVisitor);
    }
}
