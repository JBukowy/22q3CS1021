package week1.shapedemo;

import java.util.ArrayList;

public class ClassDriver {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle("brown", 4,4,0,0);

        Circle circ1 = new Circle("brown", 4,0,0);

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(rec1);
        shapes.add(circ1);

        for(Shape shp: shapes){
            System.out.println(shp.area());
        }



    }
}
