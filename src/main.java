import data_structures.Stack;

public class main {
    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push("Java");
        stack.push("Python");
        stack.push("C#");
        stack.push("C");
        stack.push("C++");

        stack.pop();

        stack.push("Javascript");

        stack.printAll();

        stack.peek();

        System.out.println("Is Empty? " + stack.isEmpty());
        System.out.println("Is Full? " + stack.isFull());
        System.out.println("Size: " + stack.size());
    }
}
