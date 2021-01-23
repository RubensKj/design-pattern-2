package com.rubenskj.pattern.bridges.adapters;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa {
    @Override
    public String devolveMapa(String rua) {

        try {
            String googleMaps = "http://maps.google.com.br/maps?q=rua+vergueira";
            URL url = new URL(googleMaps);
            InputStream inputStream = url.openStream();

            return "mapa";
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
