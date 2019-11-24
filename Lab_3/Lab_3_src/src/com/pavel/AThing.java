package com.pavel;
abstract class AThing {
    protected String Type;
    AThing(String s) {
        Type = s;
    }
    String getType() {
        return Type;
    }
}
