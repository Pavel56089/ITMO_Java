package com.pavel;
import ru.ifmo.se.pokemon.*;
public class SweetKiss extends StatusMove{
    protected SweetKiss(){
        super(Type.NORMAL,0,75);
    }
    @Override
    protected void applyOppEffects(Pokemon foe) {
        Effect.confuse(foe);
    }
    protected String describe() {
        return "атакует Rock Polish";
    }
}
