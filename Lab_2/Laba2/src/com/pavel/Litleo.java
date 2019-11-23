package com.pavel;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Litleo extends Pokemon {
    Litleo(String name, int level){
        super(name,level);
        this.setStats(62, 50, 58, 73, 54, 72);
        this.setType(Type.FIRE, Type.NORMAL);
        this.setMove(new Swagger(), new ChargeBeam(), new Facade());
    }
}
