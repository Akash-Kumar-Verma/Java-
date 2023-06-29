package DesignPattern.Builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.userBuilder().setUserName("Akash Verma").setUserId("aka121").setEmailId("akas@gmail.com").build();

        System.out.println(user);
        System.out.println(user.toString());
    }
}
