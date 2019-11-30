package com.pavel;
class Animal extends Human {
    private String Type;
    Animal(String n, String type) {
        super(n);
        Type = type;
    }

    @Override
    public int hashCode() {
        return super.hashCode()+Type.hashCode();
    }

    @Override
    public String toString() {
        return (super.toString() + Type);
    }


}
