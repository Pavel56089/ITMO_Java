package com.pavel;
public class Thing extends AThing {
    Thing(String s) {
        super(s);
    }
    void remove(){
        System.out.println(super.getType() + " разлетелся в дребизги");
    }

    @Override
    public int hashCode() {
        return super.getType().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }else{
            boolean comp = (obj.hashCode() == this.hashCode());
            return comp;
        }

    }

    @Override
    public String toString() {
        return "Вещь " + super.getType();
    }
}
