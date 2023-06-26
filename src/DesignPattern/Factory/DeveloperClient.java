package DesignPattern.Factory;

public class DeveloperClient {
    public static void main(String[] args) {

        Employee employee=EmployeeFactoryClass.getEmployee("Android Developer");
        System.out.println(employee);
        System.out.println("Salary:"+employee.Salary());

        Employee employee2=EmployeeFactoryClass.getEmployee("Web Developer");
        System.out.println(employee2);
        System.out.println("Salary:"+employee2.Salary());
    }
}
