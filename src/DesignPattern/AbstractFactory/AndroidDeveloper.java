package DesignPattern.AbstractFactory;


public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        return 5000;
    }

    public String name() {
        System.out.println("I'm Android Developer");
        return "Android Developer";
    }
}
