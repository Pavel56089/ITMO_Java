package com.pavel;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Frogadier extends Froakie {
    Frogadier (String name, int level){
        super(name,level);
        this.setStats(54, 63, 52, 83, 56, 97);
        this.setType(Type.WATER);
        this.setMove(new Rest(), new Twister(), new Facade());
    }
}
