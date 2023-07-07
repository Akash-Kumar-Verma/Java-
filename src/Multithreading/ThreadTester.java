package Multithreading;

public class ThreadTester {
    public static void main(String[] args) {
//        System.out.println("Main Started");
//        Thread1 thread1=new Thread1();
//        thread1.setName("Akash");
//        thread1.start();
//        System.out.println(thread1.getName());
//
//        Thread thread2=new Thread(new Thread2());
//        thread2.start();
//        System.out.println("Main ended");

        Stack stack=new Stack(10);

        new Thread(()->{
            int counter=0;
            while (++counter<10)
                System.out.println("Pushed: "+stack.push(100));
        },"Pusher").start();

        new Thread(()->{
            int counter=0;
            while (++counter<10)
                System.out.println("Popped: "+stack.pop());
        },"Poper").start();


    }
}
