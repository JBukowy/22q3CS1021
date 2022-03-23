package week2;

public class PersonDriver {

    public static void main(String[] args) {

        Person p1 = new Person("John");
        Employee e1 = new Employee("Zach", 1);
        Person e2 = e1;

        //p1.display();
        e2.display();
        System.out.println(e2);


    }


}
