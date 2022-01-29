package oops;

public class RunnerClass {

    public static void main(String[] args) {

       /* Employee emp1 = new Employee();
        emp1.Name = "Sachin";
        emp1.EmployeeId = 242423;
        emp1.Salary = 1000;

        Employee emp2 = new Employee();
        emp2.Name = "Mahesh";
        emp2.EmployeeId = 543456;
        emp2.Salary = 1200;

        */
        //System.out.println("Name of emp1 " + emp1.Name);
        //System.out.println("Name of emp2 " + emp2.Name);

        //Employee emp1 = new Employee("Sachin", 242423, 1000);
        //Employee emp2 = new Employee("Mahesh", 543456, 1200);
        // Employee emp3 = new Employee("Rahul", 456785, 1000);
        Employee.CompanyName = "Infosys Technology";
        Employee.ChangeCompanyName();
        Employee.Salary=2000;

        //emp1.PrintName();
        //emp2.PrintName();

        Employee emp3 = new Employee("Rahul", 456785, 1000);
        Employee.ChangeCompanyName();

        //Employee emp4 = new Employee();

        Person per1 = new Person();
        Person per2 = new ChildClass();

        ChildClass child = new ChildClass();
        ChildClass child1 = new ChildClass("Rahul", 30, "Actor");
        //child1.display();

        //per1.display();
        per2.display();

        //child1.display();
        //child1.print();

        MethodOverLoadingExample obj = new MethodOverLoadingExample();
        obj.sum(4,6);
        obj.sum(4, 6, 7);

        ICICIBank bank1 = new ICICIBank();
        bank1.Creditcard();
        bank1.Welcome();

        EncapsulationExample obj10 = new EncapsulationExample();
        obj10.setName("Rohit");
        System.out.println(obj10.getName());
    }
}
