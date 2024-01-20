package data_structures;
//
// Number Stack implementation in Java
//
//class Stack {
//
//    private int arr[];
//    private int top;
//    private int capacity;
//
//    // Creating a stack
//    public Stack(int size) {
//        arr = new int[size];
//        capacity = size;
//        top = -1;
//    }
//
//    // Add elements into stack
//    public synchronized void push(int x) {
//        if (isFull()) {
//            System.out.println("OverFlow\nProgram Terminated\n");
//            System.exit(1);
//        }
//
//        System.out.println("Inserting " + x);
//        arr[++top] = x;
//    }
//
//    // Remove element from stack
//    public synchronized int pop() {
//        if (isEmpty()) {
//            System.out.println("STACK EMPTY");
//            System.exit(1);
//        }
//        return arr[top--];
//    }
//
//    public synchronized int peek() {
//        int len = arr.length;
//        if(len==0){
//            throw new Error("No Elements in Stack");
//        }
//        return len-1;
//    }
//
//    // Utility function to return the size of the stack
//    public synchronized int size() {
//        return top + 1;
//    }
//
//    // Check if the stack is empty
//    public synchronized Boolean isEmpty() {
//        return top == -1;
//    }
//
//    // Check if the stack is full
//    public synchronized Boolean isFull() {
//        return top == capacity - 1;
//    }
//
//    public synchronized void printStack() {
//        for (int i = 0; i <= top; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//
//}


// String Stack implementation in Java
public class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    // Method to push a string onto the stack
    public synchronized void push(String value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    // Method to pop a string from the stack
    public synchronized String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        return stackArray[top--];
    }

    // Method to peek at the top element of the stack
    public synchronized String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return null;
        }
        return stackArray[top];
    }

    // Method to check if the stack is empty
    public synchronized boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public synchronized boolean isFull() {
        return top == maxSize - 1;
    }

    // Method to get the size of the stack
    public synchronized int size() {
        return top + 1;
    }

    // Method to print all elements in the stack
    public synchronized void printAll() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
