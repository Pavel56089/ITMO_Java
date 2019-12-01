package com.pavel;

public class HeadOfAnimal {
    private String Name;
    private Animal Anim;
    HeadOfAnimal(Animal anml){
        Name = "Голова животного " + anml.getName();
        Anim = anml;
    }

    public void hit(Thing p){
        System.out.println(Name + " ударилась о " + p.getType());
    }

    void appear(){
        System.out.println(Name + " появиласб ");
    }
}
