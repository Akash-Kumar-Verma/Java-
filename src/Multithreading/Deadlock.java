package Multithreading;

public class Deadlock {
    public static void main(String[] args) {

        String lock1 = "Akash";
        String lock2 = "Verma";

        System.out.println("Main Starting");
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Lock acquired.");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("Lock acquired.");
                }
            }
        });

        thread1.start();
        thread2.start();
        System.out.println("Main Ending..");
    }
}
