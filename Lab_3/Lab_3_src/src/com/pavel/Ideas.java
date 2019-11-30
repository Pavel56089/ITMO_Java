package com.pavel;

public enum Ideas {
    Sea("Стать моряком"),
    GoHome("Убежать из дома");

    private final String Type;
    Ideas(String t) {
        Type = t;
    }

    @Override
    public String toString() {
        return Type;
    }
}
