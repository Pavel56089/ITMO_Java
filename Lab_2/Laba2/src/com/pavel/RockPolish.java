package com.pavel;
import ru.ifmo.se.pokemon.*;
public class RockPolish extends StatusMove{
    protected RockPolish(){
        super(Type.ROCK,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon foe) {
        foe.setMod(Stat.SPEED, 2);
    }
    protected String describe() {
        return "атакует Rock Polish";
    }
}
