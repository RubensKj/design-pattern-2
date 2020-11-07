package com.rubenskj.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {

    private static Map<String, Nota> notas = new HashMap<String, Nota>();

    public Nota pega(String nome) {
        if (notas.containsKey(nome)) {
            return notas.get(nome);
        }

        return this.addNota(nome);
    }

    private Nota addNota(String nome) {
        if (nome == null) {
            throw new RuntimeException("Nome não pode ser nulo.");
        }

        switch (Notas.valueOf(nome.toUpperCase())) {
            case DO:
                notas.put("do", new Do());
                return notas.get("do");
            case DO_SUSTENIDO:
                notas.put("do_sustenido", new DoSustenido());
                return notas.get("do_sustenido");
            case RE:
                notas.put("re", new Re());
                return notas.get("re");
            case RE_SUSTENIDO:
                notas.put("re_sustenido", new ReSustenido());
                return notas.get("re_sustenido");
            case MI:
                notas.put("mi", new Mi());
                return notas.get("mi");
            case FA:
                notas.put("fa", new Fa());
                return notas.get("fa");
            case SOL:
                notas.put("sol", new Sol());
                return notas.get("sol");
            case LA:
                notas.put("la", new La());
                return notas.get("la");
            case SI:
                notas.put("si", new Si());
                return notas.get("si");
            default:
                throw new RuntimeException("Não foi possivel encontrar nenhuma nota para esse nome");
        }
    }
}
