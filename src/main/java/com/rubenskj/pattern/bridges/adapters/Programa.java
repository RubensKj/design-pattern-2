package com.rubenskj.pattern.bridges.adapters;

import java.io.IOException;

public class Programa {

    public static void main(String[] args) throws IOException {

        Mapa mapa = new GoogleMaps();
        mapa.devolveMapa("rua vergueira");

        RelogioDoSistema relogioDoSistema = new RelogioDoSistema();
        relogioDoSistema.hoje();
    }
}
