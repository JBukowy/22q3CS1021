package week2;

public class Employee extends Person{

    private int id;

    Employee(String name, int id){
        super(name);
        this.id = id;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("The employee id is: " + this.id);
    }

}
