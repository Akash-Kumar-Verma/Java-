package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTube implements Subject {
    List<observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(observer ob) {
        this.subscribers.add(ob);
    }

    @Override
    public void unsubscribe(observer ob) {
        this.subscribers.remove(ob);
    }

    @Override
    public void newVideoUploaded(String title) {
          for(observer ob:subscribers){
              ob.notified(title);
          }
    }
}
