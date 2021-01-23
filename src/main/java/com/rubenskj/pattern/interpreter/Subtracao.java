package com.rubenskj.pattern.interpreter;

import com.rubenskj.pattern.visitor.Visitor;

public class Subtracao implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Subtracao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        return esquerda.avalia() - direita.avalia();
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitaSubtracao(this);
    }
}
