package DesignPattern.AbstractFactory;

public class ManagerDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return  new Manager();
    }
}
