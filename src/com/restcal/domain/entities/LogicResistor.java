package com.restcal.domain.entities;

public class LogicResistor {

    public float ResistorOhmiosMax (float digit1, float digit2, float multiple1 ,float tolerance1){
        return (((digit1 * 10 + digit2) * multiple1) + ((digit1 * 10 + digit2) * multiple1) * tolerance1);
    }

    public float ResistorOhmiosmin (float digit1, float digit2, float multiple1 ,float tolerance1){
        return (((digit1 * 10 + digit2) * multiple1) - ((digit1 * 10 + digit2) * multiple1) * tolerance1);
    }
}
