package com.pavel;
public class Place extends APlace {
    Place(String s) {
        super(s);
    }

    @Override
    public int hashCode() {
        return super.getPlace().hashCode();
    }

    @Override
    public String toString(){
        return "Место " + super.getPlace();
    }

    @Override
    public boolean equals(Object obj) {
        boolean comp = obj.hashCode()== this.hashCode() ? true : false;
        return comp;
    }
}
