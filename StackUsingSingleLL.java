class Node {
    int value;
    Node next;

    // Constructor
    Node(int value) {
        this.value = value;
        this.next = null;
    }
}


public class StackUsingSingleLL {
    // Create a class for implementing a stack using a linked list.
    Node top;

    StackUsingSingleLL(){
        this.top = null;
    }
    // Push an element onto the stack.
         public void push(int value) {
            Node newNode= new Node(value);
            newNode.next=top;
            top = newNode;
         }

       // Pop and return the top element from the stack.
        public int pop() {

        if(isEmpty())
            return -1;

           else {
               int poppedVal= top.value;
               top = top.next;
               return poppedVal;
        }
         }

       // Check if the stack is empty.
       public boolean isEmpty() {

           return top == null;

             }

        // Peek at the top element of the stack without removing it.
      public int peek() {
     // ...    // Check if the stack is empty
             if (isEmpty()) {

             System.out.println("Stack is empty");
          //
          return -1;
} else {
                 return top.value;
             }}
 public static void main(String[] args) {

                // Create an instance of LinkedListStack.
        StackUsingSingleLL st= new StackUsingSingleLL();
                 // Push elements onto the stack.
      st.push(11);
              st.push(31);
              st.push(54);
                 // Peek at the top element.

                 // Pop elements from the stack and print them

              System.out.println(st.pop());  //print 54
              System.out.println(st.pop()); // print 31

     System.out.println(st.peek());   // print 11
              // for checking stack is empty or not
              System.out.println( " Is Stack Empty " + st.isEmpty());
    }
}
