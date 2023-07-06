package DesignPattern.Iterator;

public class Main {
    public static void main(String[] args) {
        UserManagement userManagement=new UserManagement();

        userManagement.addUser(new User("Akash","12"));
        userManagement.addUser(new User("Vikash","32"));
        userManagement.addUser(new User("Satish","52"));


        MyIterator iterator= userManagement.getIterator();
        while (iterator.hasnext()){
            User user= (User) iterator.next();
            System.out.println(user.getName());
        }
    }
}
