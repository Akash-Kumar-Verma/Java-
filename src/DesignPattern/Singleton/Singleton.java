package DesignPattern.Singleton;

class Singleton {
    private static Singleton obj;
    private Singleton() {
    }

    //not a thread safe
//    public static Singleton getInstance(){
//        if(obj==null){
//            obj=new Singleton();
//        }
//        return obj;
//    }

    public static Singleton getInstance(){
        if(obj==null){
            synchronized (Singleton.class) {
                obj = new Singleton();
            }
        }
        return obj;
    }
}

