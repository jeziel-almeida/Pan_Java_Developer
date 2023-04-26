package com.FactoryMethod;

public class Main {

    public static void main(String[] args) {

        Polygon triangle = PolygonFactory.createPolygon(3);
        System.out.println(triangle.getDescription());

        Polygon square = PolygonFactory.createPolygon(4);
        System.out.println(square.getDescription());

        Polygon pentagon = PolygonFactory.createPolygon(5);
        System.out.println(pentagon.getDescription());

    }
}