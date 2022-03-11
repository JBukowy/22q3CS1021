package week1.shapedemo;

public class Circle implements Shape{

    double centerX;
    double centerY;
    double radius;
    String color;

    public Circle(double centerX, double centerY, double radius, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.color = color;
    }


    @Override
    public double area() {
        return Math.PI * radius *radius;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public String getColor() {
        return null;
    }
}
