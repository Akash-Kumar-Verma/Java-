package DesignPattern.Observer;

public interface Subject {
    void subscribe(observer ob);
    void unsubscribe(observer ob);
    void newVideoUploaded(String title);
}
