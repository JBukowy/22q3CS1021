package week1.shapedemo;

public class Circle implements Shape{

    double centerX;
    double centerY;
    double radius;
    String color;

    public Circle(String color, double radius, double centerX, double centerY){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.color = color;
    }

    public double diameter(){
        return radius * 2;
    }

    @Override
    public double area() {
        return Math.PI * radius *radius;
    }

    @Override
    public double perimeter() {
        return 2 * radius * Shape.PI;
        //return 2 * radius * Math.PI;
    }

    @Override
    public String getColor() {
        return color;
    }
}
