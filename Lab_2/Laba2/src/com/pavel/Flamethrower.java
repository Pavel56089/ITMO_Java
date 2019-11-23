package com.pavel;

import ru.ifmo.se.pokemon.*;
public class Flamethrower extends SpecialMove{
    protected Flamethrower(){
        super(Type.FIRE,95,100);
    }
    @Override
    protected void applyOppEffects(Pokemon foe) {
        if (Math.random()<=0.1){
            Effect.burn(foe);
        }
    }
    protected String describe() {
        return "атакует Flamethrower";
    }
}