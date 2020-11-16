package com.rubenskj.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<Estado> estados = new ArrayList<>();

    public Estado pega(int index) {
        return estados.get(index);
    }

    public void add(Estado estado) {
        estados.add(estado);
    }
}
