package com.pavel;

import exceptions.SamePlaceException;

public interface WalkingHuman {
    void walk(Place h) throws SamePlaceException;
    String getName();
}
