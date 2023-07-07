package Multithreading;

public class Stack {
    private int[] array;
    private int stackTop;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
    }

    public boolean push(int element) {
        if (isFull()) return false;
        stackTop++;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        array[stackTop] = element;
        return true;
    }

    public int pop() {
        if (isEmpty()) return -1;
        int element = array[stackTop];
        stackTop--;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        return element;
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= array.length - 1;
    }

}
