public class practiceSinglell {

    //Step 1: Create a node class
    class Node {

        int data;
        Node next;


        // then constructor
        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    // now again provide head and tail nodes
    public Node head;
    public Node tail;

    public void Insert(int data) {
        Node newNode = new Node(data);
        // if head is null then head is inserted at the beginning of the node
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            // if it is not then newNode will be inserted at last
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void displayResult() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("List is Empty");
        }
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;

        }
        System.out.println(" ");
    }


    public static void main(String[] args) {

        practiceSinglell sl1 = new practiceSinglell();
        sl1.Insert(12);
        sl1.Insert(15);
        sl1.Insert(17);
        sl1.Insert(19);
        sl1.Insert(21);
        sl1.Insert(27);
        sl1.displayResult();

    }
}