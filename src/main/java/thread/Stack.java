package thread;

public class Stack {
    private final int[] arr;
    private  int  stackTop;

    public Stack(int capacity) {
        arr = new int[capacity];
        stackTop = -1;
    }

    public synchronized boolean push(int num) {

        if (isFull()) {
            System.out.println("Stack is full cannot push an element");
            return false;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred in thread.sleep");
            e.printStackTrace();
        }
        arr[++stackTop] = num;
        return true;
    }

    public synchronized int pop() {
        if (stackTop == -1) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        int obj = arr[stackTop];
        arr[stackTop] = Integer.MIN_VALUE;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred in thread.sleep");
            e.printStackTrace();
        }
        stackTop--;
        return obj;
    }

    public boolean isFull() {
        return (stackTop == arr.length);
    }
}
