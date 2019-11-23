package com.pavel;

import ru.ifmo.se.pokemon.*;
class Rest extends StatusMove{
    protected Rest() {
        super(Type.PSYCHIC,0,100);
    }
    @Override
    protected void applySelfEffects(Pokemon ally){
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        ally.restore();
        ally.addEffect(e);
    }
    protected String describe() {
        return "атакует Rest";
    }
}