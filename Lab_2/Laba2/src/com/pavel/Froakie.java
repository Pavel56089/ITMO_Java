package com.pavel;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Froakie extends Pokemon {
    Froakie(String name, int level){
        super(name,level);
        this.setStats(41, 56, 40, 62, 44, 71);
        this.setType(Type.WATER);
        this.setMove(new Facade(), new Rest());
    }
}
