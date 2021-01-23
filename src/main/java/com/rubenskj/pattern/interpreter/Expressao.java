package com.rubenskj.pattern.interpreter;

import com.rubenskj.pattern.visitor.Visitor;

public interface Expressao {

    int avalia();

    void aceita(Visitor visitor);
}
