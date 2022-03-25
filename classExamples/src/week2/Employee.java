package week2;

public class Employee extends Person{

    private static int numberOfEmployees = 0;
    private int id;

    Employee(String name){
        super(name);
        this.id = numberOfEmployees++;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("The employee id is: " + this.id);
    }

    @Override
    public String toString(){
        return "Employee ID: " + id;
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }

        if(!(o instanceof Employee)){
            return false;
        }

        if(o == this){
            return true;
        }

        return ((Employee) o).getName().equals(this.name);

    }

}
