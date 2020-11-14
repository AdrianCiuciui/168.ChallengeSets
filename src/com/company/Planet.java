package com.company;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }

    @Override
    public boolean addSatelite(HeavenlyBody moon) {
        if (moon.getKey().getBodyType() == BodyType.MOON) {
            return super.addSatelite(moon);
        } else {
            return false;
        }
    }
}
