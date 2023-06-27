package DesignPattern.AbstractFactory;


public class Client {
    public static void main(String[] args) {

        Employee e1=EmployeeFactory.getEmployee(new AndroidDevFactory());
        e1.name();
        e1.salary();

        Employee e2=EmployeeFactory.getEmployee(new WebDevFactory());
        e2.name();
        e2.salary();

        Employee e3=EmployeeFactory.getEmployee(new ManagerDevFactory());
        e3.name();
        e3.salary();
    }
}