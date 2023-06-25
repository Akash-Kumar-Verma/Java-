package DesignPattern.Singleton;

import DesignPattern.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton obj=Singleton.getInstance();
        System.out.println(obj.hashCode());

        Singleton obj2=Singleton.getInstance();
        System.out.println(obj2.hashCode());
    }
}
