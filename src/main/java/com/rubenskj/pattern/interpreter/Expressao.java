package com.rubenskj.pattern.interpreter;

import com.rubenskj.pattern.visitor.ImpressoraVisitor;

public interface Expressao {

    int avalia();

    void aceita(ImpressoraVisitor impressoraVisitor);
}
