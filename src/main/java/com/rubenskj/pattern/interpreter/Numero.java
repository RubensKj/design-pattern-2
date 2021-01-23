package com.rubenskj.pattern.interpreter;

import com.rubenskj.pattern.visitor.ImpressoraVisitor;
import com.rubenskj.pattern.visitor.Visitor;

public class Numero implements Expressao {

    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int avalia() {
        return numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitaNumero(this);
    }
}
