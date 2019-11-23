package com.pavel;

import ru.ifmo.se.pokemon.*;
public class Smog extends SpecialMove{
    protected Smog(){
        super(Type.POISON,20,70);
    }
    @Override
    protected void applyOppEffects(Pokemon foe) {
        if (Math.random() <= 0.4){
            Effect.poison(foe);
        }
    }
    protected String describe() {
        return "атакует Smog";
    }
}
