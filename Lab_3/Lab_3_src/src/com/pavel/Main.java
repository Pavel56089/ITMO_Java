package com.pavel;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Human ChristoferRobin = new Human("Кристофер");
        Animal BearPuh = new Animal("Винни Пух", "медведь");
        HeadOfAnimal HeadOfPuh = new HeadOfAnimal(BearPuh);
        Animal Pyatochok = new Animal("Пяточок", "свинья");
        Animal Slonopotam = new Animal("Слонопотам", "слон");
        HeadOfAnimal HeadOfSlonopotam = new HeadOfAnimal(Slonopotam);
        Thing pot = new Thing("горшок");
        Thing root = new Thing("корень");
        Place house = new Place("дом Пяточка");
        ChristoferRobin.useSkill("покатился со смеху");
        for(int i =0; i<3;i++){
            ChristoferRobin.useSkill("хохотал");
        }
        HeadOfSlonopotam.hit(root);
        HeadOfPuh.appear();
        pot.remove();
        Pyatochok.useSkill("понял, каким он был глупым");
        Pyatochok.walk(house);
        Pyatochok.sleepWithPain();
        Pyatochok.decide(Ideas.GoHome);
        Pyatochok.decide(Ideas.Sea);
        ChristoferRobin.equals(new Integer(1));

    }
}
