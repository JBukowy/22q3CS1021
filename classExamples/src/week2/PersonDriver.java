package week2;

public class PersonDriver {

    public static void main(String[] args) {

        Employee e1 = new Employee("John");
        Employee e2 = new Employee("Zach");
        Employee e3 = new Employee("Cody");
        Employee e4 = new Employee("John");

        /*e1.display();
        e2.display();
        e3.display();*/

        //System.out.println(e1);

        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e4));



    }


}
