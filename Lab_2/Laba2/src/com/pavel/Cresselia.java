package com.pavel;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cresselia extends Pokemon {
    Cresselia(String name, int level){
        super(name,level);
        this.setStats(120, 70, 120, 75, 130, 85);
        this.setType(Type.PSYCHIC);
        this.setMove(new RockPolish(), new Smog(), new Flamethrower(), new RockThrow());
    }
}
