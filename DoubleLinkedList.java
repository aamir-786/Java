public class DoubleLinkedList {

    Node head;
        public  DoubleLinkedList (){
              head =null;
          }
    // Method to insert a new node with given name at the beginning of the linked list
    public void insertAtBeginning(String name) {
        // Your implementation here
   Node newNode = new Node(name);
   if(head == null) {
       head = newNode;
   }  else {
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
       }

    }

    // Method to insert a given node at the beginning of the linked list
    public void insertAtBeginning(Node node) {
        // Your implementation here
           if(head == null){
               head=node;
           }
           else {
               node.next = head;
               head.prev=node;
               head=node;
           }

    }

    // Method to insert a new node with given name at the end of the linked list
    public void insertAtEnd(String name) {
        // Your implementation here
        Node current;
        Node newNode1 = new Node(name);
        current = head;
        if (current == null) {
            head = newNode1;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next=newNode1 ;
        }
    }
    // Method to insert a given node at the end of the linked list
    public void insertAtEnd(Node node) {
        // Your implementation here
        if (head == null) {
            head = node;
        } else {
            while (head.next != null) {
                head = head.next;
            }
            head.next = node;
        }

    }
    // Add node after name which is provided as param, name and node as params
    public void insertAfterName(String name, Node node) {
        // Your implementation here
    }

    // Add node before name which is provided as param, name and node as params
    public void insertBeforeName(String name, Node node) {
        // Your implementation here
    }

    // Make double linkedlist as Circular Double LinkedList
    public void makeCircular() {
        // Your implementation here
    }

    // Print all the nodes in linkedlist, make sure it works on circular double linkedlist
    public void printAll() {
        if (head == null) {
            System.out.println("The list is empty.");
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.name + " <--> ");
            current = current.next;
            if (current == head) {
                break; // Stop printing if we have traversed the whole list
            }
        }
        System.out.println();
    }


    public static void main(String[] args)
    {

        DoubleLinkedList list = new DoubleLinkedList();

        list.insertAtBeginning("1st");
        list.insertAtBeginning("2nd");
        list.insertAtBeginning("3rd");
         list.printAll();
         Node node = new Node("zero");
         list.insertAtBeginning(node);
         list.printAll();
         list.insertAtEnd(" AtEndName ");
       list.printAll();
        Node node1 = new Node("AtEndName@2 ");
       list.insertAtEnd(node1);
       list.printAll();
    }

    }
