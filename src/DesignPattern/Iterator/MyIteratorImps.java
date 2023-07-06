package DesignPattern.Iterator;

import java.util.ArrayList;

public class MyIteratorImps implements MyIterator {

    ArrayList<User> list = new ArrayList<>();
    int position=0;
    int size=0;

    MyIteratorImps(ArrayList<User> users) {
        this.list = users;
        this.size=users.size();
    }

    @Override
    public boolean hasnext() {
        if (position >= size) {
            return false;
        }else
            return true;
    }

    @Override
    public Object next() {
        User user=list.get(position);
        position+=1;
        return user;
    }
}
