package DesignPattern.Prototype;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("263.42.4.4");
        networkConnection.setImportantData("Very Very Important Data");
        networkConnection.loadImportantData();
        System.out.println(networkConnection);

        NetworkConnection networkConnection1 = networkConnection.clone();
        System.out.println(networkConnection1);


    }
}
