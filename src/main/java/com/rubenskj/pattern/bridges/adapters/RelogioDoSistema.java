package com.rubenskj.pattern.bridges.adapters;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio {

    @Override
    public Calendar hoje() {
        return Calendar.getInstance();
    }
}
