package DesignPattern.Factory;

public class EmployeeFactoryClass {
    public static Employee getEmployee(String s) {
        if (s.equalsIgnoreCase("Android Developer")) {
            return new AndroidDeveloper();
        } else if (s.equalsIgnoreCase("Web Developer")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}
