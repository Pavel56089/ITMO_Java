package com.pavel;
import javax.lang.model.element.Name;

class Human implements IHuman, IStandardFunc {
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
        boolean comp = obj.hashCode()== this.hashCode() ? true : false;
        return comp;
    }

    @Override
    public String toString() {
        return Name + " находится на месте: " + place.getPlace();
    }

    void useSkill(String p) {
        System.out.println(Name + " " + p);
    }

    void appear(){
        System.out.println(Name + " появился ");
    }


    public void walk(APlace h){
        place = h;
        System.out.println(Name + " стремглав помчался на место: " + place.getPlace());
    }

    public void sleep(){
        System.out.println(Name + " лег в постель и поспал");
    }

    public void decide(Ideas p){
        System.out.println(Name + " решил " + p.toString());
    }

    public void hit(Thing p){
        System.out.println(Name + " ударился о " + p.getType());
    }

    public String getName(){
        return Name;
    }
}
