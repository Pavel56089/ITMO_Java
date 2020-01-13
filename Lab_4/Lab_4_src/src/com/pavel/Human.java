package com.pavel;


import exceptions.SamePlaceException;

class Human implements WalkingHuman, StdFunctional {
    private String Name;
    Place place;
    Human(String n) {
        Name = n;
    }

    @Override
    public int hashCode() {
        return super.hashCode()+Name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return Name + " находится на месте: " + place.getPlace();
    }

    void useSkill(String p) {
        System.out.println(Name + " " + p);
    }


    @Override
    public void walk(Place plc)  throws SamePlaceException {
        if (place == plc){
            throw new SamePlaceException("Нельзя переместиться в то же место", plc.getPlace());
        }else{
            place = plc;
            System.out.println(Name + " переместился на место " + place.getPlace());
        }

    }

    public void sleepWithPain(){
        System.out.println(Name + " лег в постель с головной болью и поспал");
    }

    public void decide(Ideas p){
        System.out.println(Name + " решил " + p.toString());
    }


    public String getName(){
        return Name + this.hashCode();

    }

    public void useItem(Thing p, String s){
        System.out.println(Name + " " + s + " " + p.toString());
    }


}
