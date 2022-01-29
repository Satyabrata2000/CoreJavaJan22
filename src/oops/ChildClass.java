package oops;

public class ChildClass extends Person{


    String Profession;

    public ChildClass(){
        System.out.println("Inside Child Default Constructor");
        }

    public ChildClass(String Name, int Age, String Profession){
        super(Name,Age);
        this.Profession=Profession;
    }

    public void print(){
        System.out.println("Inside Child");
    }

    public void display(){
        //super.display();
        System.out.println("Inside Child");
    }
}
