import java.util.*;
import java.lang.*;

public class HashMap{
         int size;

         //using ArrayList
         ArrayList<Integer>[] arr;
         // USing  linkedlist
        // LinkedList <Integer>[] ll;
  // using arraylist
  public HashMap(){
      size =5;
      // using arraylist
      arr=new ArrayList [size];
      //using LinkedList
       // ll = new LinkedList [size];
  }
  public int HashFunction(int data){
      return data%size;
  }
  //using Linkedlist
/*  public void Insert(int data) {
      int key = HashFunction(data);
      if (ll[key] == null) {
          ll[key] = new LinkedList<>(Collections.singleton(size));
          ll[key].add(data);
      } else {
          ll[key].add(data);
      }
  }

      public void display() {
          for (int i = 0; i < size; i++) {
              System.out.print("Index " + i + ": ");

              if (ll[i] == null || ll[i].isEmpty()) {
                  System.out.println("Empty");
              } else {
                  for (int j = 0; j < ll[i].size(); j++) {
                      int data = (int) ll[i].get(j);
                      System.out.print(data + " ");
                  }
                  System.out.println();
              }
          }
      } */
  public void Search(int data) {
     // boolean found = false; // Flag to indicate whether the data is found

      for (int i = 0; i < size; i++) {
          if (arr[i].contains(data)) {
              System.out.println("Data found at index " + i + " and the DATA is " + arr[i]);

          }
          // Data found, no need to continue searching
         else {
                  System.out.println(" Data Not Found");
              }
          }
      }




    //using arraylist
      public void Insert(int data) {
          int key = HashFunction(data);
          if (arr[key] == null) {
              arr[key] = new ArrayList<>();
              arr[key].add(data);
          } else {
              arr[key].add(data);
          }
      }
          //arr[HashFunction(data)]=data;

 /* public void Display(){
      for(int i=0;i<size;i++){
          System.out.println(arr[i]);
  }}*/

          public void display () {
              for (int i = 0; i < size; i++) {
                  System.out.print("Index " + i + ": ");

                  if (arr[i] == null || arr[i].isEmpty()) {
                      System.out.println("Empty");
                  } else {
                      for (int j = 0; j < arr[i].size(); j++) {
                          int data = (int) arr[i].get(j);
                          System.out.print(data + " ");
                      }
                      System.out.println();
                  }
              }
          }




    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.Insert(23);
        hm.Insert(28);
        hm.Insert(34);
        hm.Insert(44);
        hm.Insert(30);
        hm.Insert(32);
        hm.Insert(35);
        hm.Insert(31);
        hm.display();
        hm.Search(34);
    }
}
