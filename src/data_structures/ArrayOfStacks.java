package data_structures;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayOfStacks {
    private ArrayList<Object[]> stacks;
    private int stackSize;

    public ArrayOfStacks(int stackSize) {
        this.stacks = new ArrayList<>();
        this.stackSize = stackSize;
    }

    public void push(int stackIndex, Object value) {
        ensureStackExists(stackIndex);
        Object[] stack = stacks.get(stackIndex);
        if (isFull(stack)) {
            System.out.println("Stack " + stackIndex + " is full. Cannot push " + value);
            return;
        }
        stack[getTop(stack) + 1] = value;
    }

    public Object pop(int stackIndex) {
        ensureStackExists(stackIndex);
        Object[] stack = stacks.get(stackIndex);
        if (isEmpty(stack)) {
            System.out.println("Stack " + stackIndex + " is empty. Cannot pop.");
            return null;
        }
        return stack[getTop(stack)--];
    }

    public Object peek(int stackIndex) {
        ensureStackExists(stackIndex);
        Object[] stack = stacks.get(stackIndex);
        if (isEmpty(stack)) {
            System.out.println("Stack " + stackIndex + " is empty. Cannot peek.");
            return null;
        }
        return stack[getTop(stack)];
    }

    public boolean isEmpty(int stackIndex) {
        ensureStackExists(stackIndex);
        Object[] stack = stacks.get(stackIndex);
        return getTop(stack) == -1;
    }

    public boolean isFull(int stackIndex) {
        ensureStackExists(stackIndex);
        Object[] stack = stacks.get(stackIndex);
        return getTop(stack) == stackSize - 1;
    }

    private void ensureStackExists(int stackIndex) {
        while (stacks.size() <= stackIndex) {
            stacks.add(new Object[stackSize]);
        }
    }

    private int getTop(Object[] stack) {
        for (int i = stack.length - 1; i >= 0; i--) {
            if (stack[i] != null) {
                return i;
            }
        }
        return -1;
    }

    private boolean isFull(Object[] stack) {
        return getTop(stack) == stack.length - 1;
    }

}
