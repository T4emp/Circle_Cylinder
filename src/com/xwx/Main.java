package com.xwx;

public class Main {

    public static void main(String[] args) {
        //Test Cylinder
        Cylinder cy1 = new Cylinder();
        System.out.println("Радиус = " + cy1.getRadius() + ", Высота = " + cy1.getHeight() +
                ", Цвет - " + cy1.getColor() + ", Площадь поверхности = " + cy1.getArea() +
                ", Объём = " + cy1.getVolume());

        Cylinder cy2 = new Cylinder(5.0, 2.0);
        System.out.println("Радиус = " + cy2.getRadius() + ", Высота = " + cy2.getHeight() +
                ", Цвет - " + cy2.getColor() + ", Площадь поверхности = " + cy2.getArea() +
                ", Объём = " + cy2.getVolume());
    }
}