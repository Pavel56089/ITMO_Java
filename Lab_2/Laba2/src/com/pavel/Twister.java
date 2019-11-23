package com.pavel;
import ru.ifmo.se.pokemon.*;
public class Twister extends SpecialMove{
    protected Twister(){
        super(Type.DRAGON,40,100);
    }

    protected String describe() {
        return "атакует Twister";
    }
}
