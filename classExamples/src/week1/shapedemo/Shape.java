package week1.shapedemo;

public interface Shape {

    static final double PI = 3.14159265789;

    public double area();

    double perimeter();

    String getColor();

    static int maximumArea(Shape obj1, Shape obj2){
        if(obj1.area() > obj2.area()){
            return 1;
        }else if(obj1.area() < obj2.area()){
            return -1;
        }else{
            return 0;
        }
    }

}
