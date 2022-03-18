package week1.shapedemo;

public class Rectangle implements Shape{

    double upperLeftX;
    double upperLeftY;
    double width;
    double height;
    String color;

    Rectangle(String color, double height, double width, double upperLeftX, double upperLeftY){
        this.color = color;
        this.height = height;
        this.width = width;
        this.upperLeftX = upperLeftX;
        this.upperLeftY = upperLeftY;
    }

    public boolean isSquare(){
        return height == width;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getColor() {
        return color;
    }
}
