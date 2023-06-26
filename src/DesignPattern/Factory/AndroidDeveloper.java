package DesignPattern.Factory;

public class AndroidDeveloper implements Employee{
    @Override
    public int Salary() {
        System.out.println("Getting the Salary of Android Developer");
        return 50000;
    }
}
