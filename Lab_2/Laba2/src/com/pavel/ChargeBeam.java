package com.pavel;
import ru.ifmo.se.pokemon.*;
public class ChargeBeam extends SpecialMove{
    protected ChargeBeam(){
        super(Type.ELECTRIC,50,90);
    }
    protected String describe() {
        return "атакаует Charge Beam";
    }
}