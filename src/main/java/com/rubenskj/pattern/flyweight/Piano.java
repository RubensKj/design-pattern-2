package com.rubenskj.pattern.flyweight;

import org.jfugue.player.Player;

import java.util.List;

public class Piano {

    public void toca(List<Nota> musica) {
        Player player = new Player();

        StringBuilder musicaNotas = new StringBuilder();
        for (Nota nota : musica) {
            musicaNotas.append(nota.simbolo())
                    .append(" ");
        }

        System.out.println(musicaNotas.toString());

        player.play(musicaNotas.toString());
    }
}
