package com.pavel;


class Human implements WalkingHuman, StdFunctional {
    private String Name;
    APlace place;
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



    public void walk(APlace plc){
        place = plc;
        System.out.println(Name + " стремглав помчался на место: " + place.getPlace());
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
}
