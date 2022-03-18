package week2;

public class Employee extends Person{

    private int id;

    Employee(String name, int id){
        super(name);
        this.id = id;
    }

    public void display(){
        System.out.println("The employee name is: " + super.name);
        System.out.println("The employee id is: " + this.id);

    }

}
