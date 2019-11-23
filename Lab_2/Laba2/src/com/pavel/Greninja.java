package com.pavel;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Greninja extends Frogadier {
    Greninja(String name, int level){
        super(name,level);
        this.setStats(72, 95, 67, 103, 71, 122);
        this.setType(Type.WATER, Type.DARK);
        this.setMove(new Rest(), new Facade(), new Twister());
    }
}
