class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 class CircularLinkedList {
    Node head;

    public CircularLinkedList() {
        head = null;
    }

    // Method to check if the circular linked list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to insert a new node at the beginning of the circular linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    // Method to insert a new node at the end of the circular linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Method to delete a node with a given key from the circular linked list
    public void delete(int key) {
        if (isEmpty()) {
            System.out.println("Circular Linked List is empty. Deletion failed.");
            return;
        }

        Node current = head;
        Node prev = null;

        // If head node itself holds the key to be deleted
        if (current.data == key) {
            while (current.next != head) {
                current = current.next;
            }
            current.next = head.next;
            head = head.next;
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        do {
            prev = current;
            current = current.next;
        } while (current != head && current.data != key);

        // If key was not present in the circular linked list
        if (current == head) {
            System.out.println("Key not found in the Circular Linked List. Deletion failed.");
            return;
        }

        // Unlink the node from the circular linked list
        prev.next = current.next;
    }

    // Method to search for a given key in the circular linked list
    public boolean search(int key) {
        if (isEmpty()) {
            System.out.println("Circular Linked List is empty. Search failed.");
            return false;
        }

        Node current = head;

        // Traverse the circular linked list
        do {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }

    // Method to display the circular linked list
    public void display() {
        if (isEmpty()) {
            System.out.println("Circular Linked List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

 public class CircularLL{
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Insert elements
        list.insertAtEnd(12);
        list.insertAtEnd(22);
        list.insertAtEnd(32);
        list.insertAtEnd(42);
        list.insertAtEnd(52);
        list.insertAtEnd(222);
        list.insertAtEnd(422);
        list.insertAtEnd(522);

        // Display the list
        System.out.println("Circular Linked List:");
        list.display();

        // Insert at beginning
        list.insertAtBeginning(0);
        System.out.println("Circular Linked List after inserting 0 at the beginning:");
        list.display();

        // Delete element
        list.delete(32);
        System.out.println("Circular Linked List after deleting 3:");
        list.display();

        // Search for element
        int searchKey = 42;
        if (list.search(searchKey)) {
            System.out.println(searchKey + " found in the Circular Linked List.");
        } else {
            System.out.println(searchKey + " not found in the Circular Linked List.");
        }
    }
}
