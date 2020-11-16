package com.rubenskj.pattern.memento;

import java.util.Calendar;

public class Programa {

    public static void main(String[] args) {

        Historico historico = new Historico();
        Contrato contrato = new Contrato(Calendar.getInstance(), "Rubens", TipoContrato.NOVO);

        historico.add(contrato.salvaEstado());

        System.out.println(contrato.getTipo());

        contrato.avanca();
        historico.add(contrato.salvaEstado());

        System.out.println(contrato.getTipo());

        contrato.avanca();
        historico.add(contrato.salvaEstado());

        Estado estadoAnterior = historico.pega(2);

        System.out.println(estadoAnterior.getContrato().getTipo());
    }
}
