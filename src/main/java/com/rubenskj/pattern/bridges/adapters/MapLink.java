package com.rubenskj.pattern.bridges.adapters;

public class MapLink implements Mapa {
    @Override
    public String devolveMapa(String rua) {
        return "mapa do maplink";
    }
}
