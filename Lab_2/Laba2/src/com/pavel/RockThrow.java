package com.pavel;
import ru.ifmo.se.pokemon.*;
public class RockThrow extends PhysicalMove{
    protected RockThrow(){
        super(Type.ROCK,50,90);
    }
    protected String describe() {
        return "атакует Rock Throw";
    }
}