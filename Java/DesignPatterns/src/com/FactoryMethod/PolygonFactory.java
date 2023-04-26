package com.FactoryMethod;

public class PolygonFactory {
    
    public static Polygon createPolygon(int numberOfSides) {
        if(numberOfSides == 3) {
            return new Triangle();
        } else if(numberOfSides == 4) {
            return new Square();
        } else if(numberOfSides == 5) {
            return new Pentagon();
        }

        return null;
    }
}
