import algorithms.linearSearch;
import data_structures.DynamicArray;
import data_structures.Stack;

import java.util.*;

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
//          Queue<String> queue= new LinkedList<String>();
//          queue.add("A");
//          queue.add("B");
//          queue.add("C");
//
//          System.out.println(queue);
//
//          queue.poll();
//
//          System.out.println(queue);
//
//          System.out.println(queue.isEmpty());
//          System.out.println(queue.size());
//          System.out.println(queue.contains("B"));
//
//         Priority Queue Data Type
//         Double
//            Queue<Double> queue= new PriorityQueue<>(Collections.reverseOrder());
//
//            queue.offer(5.2);
//            queue.offer(1.2);
//            queue.offer(2.2);
//            queue.offer(3.2);
//            queue.offer(6.1);
//
//            while(!queue.isEmpty()){
//                System.out.println(queue);
//            }
//         Priority Queue Data Type
//         String
//        Queue<String> queue= new PriorityQueue<>(Collections.reverseOrder());
//
//        queue.offer("B");
//        queue.offer("Z");
//        queue.offer("C");
//        queue.offer("J");
//        queue.offer("A");
//
//        while(!queue.isEmpty()){
//            System.out.println(queue);
//        }

// Linked List
//        LinkedList<String> linkedList= new LinkedList<String>();
//
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("E");
//        linkedList.pop();
//
//        linkedList.offer("A");
//        linkedList.offer("B");
//        linkedList.offer("C");
//        linkedList.offer("D");
//        linkedList.offer("E");
//
//        linkedList.poll();
//
//        System.out.println(linkedList);

//Dynamic Array
       // DynamicArray dynamicArray = new DynamicArray(5);

//Linear Search
//        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
//
//
//        linearSearch ls=new linearSearch(array,3);
//        int index=ls.LinearSearchFunc();
//        if(index != -1) {
//            System.out.println("Element found at index: " + index);
//        }
//        else {
//            System.out.println("Element not found");
//        }

        //Binary Search
        int array[] = new int[1000000];
        int target = 777777;

        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //int index = Arrays.binarySearch(array, target);
        int index = Arrays.binarySearch(array, target);


        if(index == -1) {
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element found at: " + index);
        }
    }
}
