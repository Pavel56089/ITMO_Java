package com.pavel;
import ru.ifmo.se.pokemon.*;
class Facade extends PhysicalMove {
    protected Facade() {
        super(Type.NORMAL,70,100);
    }
    @Override
    protected void applySelfEffects(Pokemon ally) {
        Status condition = ally.getCondition();
        if (condition.equals(Status.BURN) || condition.equals(Status.PARALYZE) || condition.equals(Status.POISON)) {
            ally.setMod(Stat.ATTACK, (int) ally.getStat(Stat.ATTACK));
        }
    }
    protected boolean checkAccuracy(Pokemon ally,Pokemon foe) {
        return true;
    }
    protected String describe() {
        return "атакует Facade";
    }
}
