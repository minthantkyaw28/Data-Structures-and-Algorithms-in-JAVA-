import data_structures.Stack;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {

//        Stack Data Type
//        Stack stack = new Stack(5);
//
//        stack.push("Java");
//        stack.push("Python");
//        stack.push("C#");
//        stack.push("C");
//        stack.push("C++");
//
//        stack.pop();
//
//        stack.push("Javascript");
//
//        stack.printAll();
//
//        stack.peek();
//
//        System.out.println("Is Empty? " + stack.isEmpty());
//        System.out.println("Is Full? " + stack.isFull());
//        System.out.println("Size: " + stack.size());

//        Queue Data Type
          Queue<String> queue= new LinkedList<String>();


          queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("B"));

    }
}
