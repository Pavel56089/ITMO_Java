package com.pavel;
import ru.ifmo.se.pokemon.*;
class Swagger extends StatusMove {
    protected Swagger() {
        super(Type.NORMAL,0,85);
    }
    @Override
    protected void applyOppEffects(Pokemon foe) {
        foe.setMod(Stat.ATTACK, 2);
        Effect.confuse(foe);
    }
    protected String describe() {
        return "атакует Swagger";
    }
}
