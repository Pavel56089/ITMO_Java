package com.pavel;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Human ChristoferRobin = new Human("Кристофер");
        Animal BearPuh = new Animal("Винни Пух");
        Animal Pyatochok = new Animal("Пяточок");
        Animal Slonopotam = new Animal("Слонопотам");
        Thing pot = new Thing("горшок");
        Thing root = new Thing("корень");
        Place house = new Place("дом Пяточка");
        ChristoferRobin.useSkill("покатился со смеху");
        for(int i =0; i<3;i++){
            ChristoferRobin.useSkill("хохотал");
        }
        Slonopotam.hit(root);
        BearPuh.appear();
        pot.remove();
        Pyatochok.useSkill("понял, каким он был глупым");
        Pyatochok.walk(house);
        Pyatochok.sleep();
        Pyatochok.decide("убежать из дому");
        Pyatochok.decide("стать моряком");

    }
}
