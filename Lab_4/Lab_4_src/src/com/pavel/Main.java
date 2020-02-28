package com.pavel;
import java.nio.charset.StandardCharsets;

import exceptions.NameLengthExeption;
import exceptions.SamePlaceException;
public class Main {
    public static void main(String[] args) throws SamePlaceException {
        System.out.println();
        Human ChristoferRobin = new Human("Кристофер");
//        try{
//            Animal murmurka = new Animal("мурмурмурмурмурмур", "кошак");
//        }catch (NameLengthExeption e) {
//            e.printStackTrace();
//        }
        Animal bearPuh = new Animal("Винни Пух", "медведь");
        Animal.HeadOfAnimal HeadOfPuh = bearPuh.new HeadOfAnimal();
        Animal pyatochok = new Animal("Пяточок", "свинья");
        Animal iaIa = new Animal("Иа-иа", "осел");
        Animal slonopotam = new Animal("Слонопотам", "чудище");
        Animal.HeadOfAnimal HeadOfSlonopotam = slonopotam.new HeadOfAnimal();
        Animal.Description animDesc = new Animal.Description();
        Thing pot = new Thing("горшок");
        Thing root = new Thing("корень");
        Thing stone = new Thing("Большой камень");
        Place house = new Place("дом Пяточка");
        Place zapadnya = new Place("6 сосен, западня");
            zapadnya.equals(null)
;        Place downriver = new Place("вниз по течению");
        Place homeOfCristopher = new Place("дом Кристофера Робина");
        pyatochok.useSkill("думал о Слонопотаме");
        pyatochok.decide(Ideas.Go6Sosnam);

//        try {
//            pyatochok.walk(zapadnya);
//            pyatochok.walk(zapadnya);
//        } catch (SamePlaceException e) {
//            e.printStackTrace();
//        }
        bearPuh.useHeadAndItem(" не мог  вытащить голову из ", pot);
        bearPuh.useSkill(" кричал: \"Мама!\", кричал: \"Помогите!\", кричал и просто: \"Ай-ай-ай");
        bearPuh.useItem(pot, "пытался стукнуть обо что-нибудь");
        bearPuh.useSkill("пытался вылезти");
        bearPuh.useSkill("издал отчаяный вопль");
        ChristoferRobin.useSkill("покатился со смеху");
        slonopotam.useSkill("Слонопотамит во всю");
        pyatochok.useSkill("заглянул в яму");
        try {
            pyatochok.walk(homeOfCristopher);
            ChristoferRobin.walk(zapadnya);
            pyatochok.walk(zapadnya);
        } catch (SamePlaceException e) {
            e.printStackTrace();
        }

        bearPuh.useItem(root, "споткнулся");
        bearPuh.useItem(pot, "попытался разбить");

        ChristoferRobin.useSkill("услышал  стук");
        pyatochok.useSkill("услышал стук");
        for(int i =0; i<3;i++){
            ChristoferRobin.useSkill("хохотал");
        }
        HeadOfSlonopotam.headAndItem(root, "ударилась");
        HeadOfPuh.appear();
        pot.remove();
        pyatochok.useSkill("понял, каким он был глупым");
        try {
            pyatochok.walk(house);
        }catch (SamePlaceException e){
            e.printStackTrace();
        }

        pyatochok.sleepWithPain();
        pyatochok.decide(Ideas.GoHome);
        pyatochok.decide(Ideas.Sea);
        ChristoferRobin.useSkill("отправился завтракать");
        bearPuh.useSkill("отправился завтракать");
        iaIa.useSkill("стоял на берегу ручья и понуро смотрел в воду на свое отражение");
        iaIa.walk(downriver);
        iaIa.useSkill("Пройдя метров двадцать, он перешел ручей вброд и так же медленно побрел обратно по другому берегу. ");
        iaIa.useSkill("остановился и снова посмотрел в воду");
        bearPuh.useSkill("появился");
        bearPuh.useItem(stone,"уселся");
        bearPuh.useSkill("запел загадочную песенку: ПРО СОРОК ПЯТОК Промолвил Носорог,-- Что лучше-- сорок пяток Или пяток сорок?-- Увы, никто на это");
        StoryTelling defaultStoryTeller = new StoryTelling() {
            @Override
            public void sayEnd() {
                System.out.println("Вот и сказке конец");
            }
        };
        defaultStoryTeller.sayEnd();
        animDesc.getArticle();

    }
}
