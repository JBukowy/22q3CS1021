package week2;

public abstract class Person {
    protected String name;

    Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display(){
        System.out.println("The employee name is: " + this.name);
    }

    abstract void makeMoney();
}
