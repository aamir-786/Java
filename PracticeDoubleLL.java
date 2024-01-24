public class PracticeDoubleLL {

       // create node class 1st
      public class Node{
        int data;
        Node next;
        // add previous node also in it
        Node prev;

        public Node( int data){
            this.data =data;

    } }

                 Node head ;
                Node tail;
     // we will make insert method for  insertion
           public void insert(int data) {
               Node newNode = new Node(data);

               if(head == null) {
                   head = tail = newNode;
                   head.prev = null;
                   tail.next = null;
               }
               else {

                   tail.next = newNode;
                   newNode.prev = tail;
                   tail = newNode;
               }
           }
            public void displayDoubleLL(){
               //   Node current = head;
               if(head==null){
                   System.out.println(" List is Empty ");
               } else {
                   System.out.println(" List is Given below : " );
                   while(head!=null){
                   System.out.print(" " + head.data + " ");
                   head=head.next;
               }
           } }



    public static void main(String[] args) {
      PracticeDoubleLL dll =new PracticeDoubleLL();
      dll.insert(1);
      dll.insert(2);
      dll.insert(3);
      dll.insert(4);
      dll.insert(5);
      dll.displayDoubleLL();




    }


}
