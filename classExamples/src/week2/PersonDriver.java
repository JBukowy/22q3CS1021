package week2;

public class PersonDriver {

    public static void main(String[] args) {

        Person p1 = new Person("John");
        Person e1 = new Employee("Zach", 1);
        Employee e2 = (Employee) e1;

        System.out.println(e1 instanceof Employee);


    }


}
