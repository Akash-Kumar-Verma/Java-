package DesignPattern.Observer;

public class subscriber implements observer{
    String name;
    public subscriber(String name){
        this.name=name;
    }
    @Override
    public void notified(String title) {
        System.out.println("Hello "+this.name+" New Video Upload : "+title);
    }
}
