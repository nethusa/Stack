package stack_imp;

class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // indicates that the stack is empty
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        
       
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.printStack();

        // Test push operation when stack is full
        stack.push(60);
        
       
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop());
        stack.printStack();
        

        System.out.println("Popped element is: " + stack.pop());
        stack.printStack();
        

        System.out.println("Top element is: " + stack.peek());
        

        while (!stack.isEmpty()) {
            System.out.println("Popped element is: " + stack.pop());
        }


        System.out.println("Popped element is: " + stack.pop());


        System.out.println("Top element is: " + stack.peek());
    }
}