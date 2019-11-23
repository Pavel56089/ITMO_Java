package com.pavel;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pyroar extends Litleo {
    Pyroar(String name, int level){
        super(name,level);
        this.setStats(86, 68, 72, 109, 66, 106);
        this.setType(Type.FIRE, Type.NORMAL);
        this.setMove(new Swagger(), new ChargeBeam(), new Facade(), new SweetKiss());
    }
}
