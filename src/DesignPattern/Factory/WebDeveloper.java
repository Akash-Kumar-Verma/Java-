package DesignPattern.Factory;

public class WebDeveloper implements Employee{

    @Override
    public int Salary() {
        System.out.println("Getting the Salary of Web Developer");
        return 40000;
    }
}
