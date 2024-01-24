// Task 1: Implementing a Stack using an Array
// Create a class for implementing a stack using an array.

      public  class  ArrayStack {
            private int[] arr;
            private  int top;
            private int maxSize;
            // Constructor to initialize the stack with a given size.
            public ArrayStack(int size) {
                // ...
                maxSize=size;
                arr= new int[maxSize];
                top = -1;
            }

            // Push an element onto the stack.
            public void push(int value) {
                if(isFull()){
                    System.out.println( " Stack is full ");
                    return ;
                }
                arr[++top]=value;
            }

            // Pop and return the top element from the stack.
            public int pop() {
                if(isEmpty()){
                    System.out.println( " Stack is Empty  ");
                    return -1;

                }
                return arr[top--];
            }

            // Check if the stack is empty.
            public boolean isEmpty() {
                // ...
                return (top==-1);
            }
            public boolean isFull() {
                // ...
                return (top==maxSize-1);
            }
            // Peek at the top element of the stack without removing it.
            public int peek() {
                // ...
                if(isEmpty()){
                    System.out.println( " peak is Empty  ");
                    return -1;
                }
                return arr[top];
            }

            public static void main(String[] args) {
            // Create a stack with a maximum size of 5
            ArrayStack stack = new ArrayStack(5);

            // Push elements onto the stack
            stack.push(10);
            stack.push(20);
            stack.push(30);

            // Peek at the top element
            int topElement = stack.peek();
            System.out.println("Top element: " + topElement);

            // Pop elements from the stack
            int poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);

            // Check if the stack is empty
            boolean isEmpty = stack.isEmpty();
            System.out.println("Is the stack empty? " + isEmpty);

            // Push more elements
            stack.push(40);
            stack.push(50);

            // Check if the stack is full
            boolean isFull = stack.isFull();
            System.out.println("Is the stack full? " + isFull);
        }
    }
