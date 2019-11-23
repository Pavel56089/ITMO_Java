package com.pavel;


import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Cresselia p1 = new Cresselia("Чужой", 1);
        Froakie p2 = new Froakie("Хищник", 1);
        Pyroar p3 = new Pyroar("Рональд Макдональд", 1);
        Frogadier p4 = new Frogadier("Кыса", 2);
        Litleo p5 = new Litleo("Мурка", 2);
        Greninja p6 = new Greninja("Псжшка", 3);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();

    }
}
