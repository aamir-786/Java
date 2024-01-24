import static java.lang.System.exit;

public class CircularLinkedList {


    class Node {
        int data;
        Node next;

        Node (int data) {
        this.data = data;
        }

    }
    Node head=null, tail=null ; int size=0;
    public void Insert(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head=newNode;
            tail=newNode;
            newNode.next=head;

        }
        else {
            tail.next=newNode;
            tail=newNode;
           tail.next=head;

        }  }
        public void DisplayCircular(){
              Node currentNode = head;
              if(currentNode==null){
                  System.out.println(" Circle is Empty" );
              }
            System.out.println(" Circle is given Below ");
              while(currentNode.next!=head){

                  System.out.print(currentNode.data + " ");
                  currentNode=currentNode.next;

            }
            System.out.println(" ");
        }


    public static void main(String[] args) {
 CircularLinkedList cll1 = new CircularLinkedList();

        cll1.Insert(122);
        cll1.Insert(123);
        cll1.Insert(124);
        cll1.Insert(125);
        cll1.Insert(126);
        cll1.Insert(127);
        cll1.DisplayCircular();

    }
}
