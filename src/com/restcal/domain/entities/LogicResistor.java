package com.restcal.domain.entities;

public class LogicResistor {

    private  float ValorNominal;

    public float ValorNominal (float digit1, float digit2, float multiple1) {
        return ((digit1 * 10 + digit2) * multiple1);
    }
    public float ResistorOhmiosMax (float digit1, float digit2, float multiple1 ,float tolerance1){
        float valorNominal = ValorNominal(digit1,digit2,multiple1);
        return valorNominal + valorNominal * tolerance1;
    }

    public float ResistorOhmiosmin (float digit1, float digit2, float multiple1 ,float tolerance1){
        float valorNominal = ValorNominal(digit1,digit2,multiple1);
        return valorNominal - valorNominal * tolerance1;
    }
}
