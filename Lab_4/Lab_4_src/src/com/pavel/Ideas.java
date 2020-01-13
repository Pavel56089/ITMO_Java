package com.pavel;

public enum Ideas {
    Sea("Стать моряком"),
    GoHome("Убежать из дома"),
    Go6Sosnam("Пойти к Шести соснам");

    private final String Type;
    Ideas(String t) {
        Type = t;
    }

    @Override
    public String toString() {
        return Type;
    }
}
