import java.util.*;

public class SimpleRecursion  {

    public static void recurseinAscendingDescending(int n){
        if(n==0){
            return;
        }
        System.out.print("" +n+ " ");
        recurseinAscendingDescending(n-1);
       System.out.print(n+ " ");

    }

    public static void main(String[] args) {
        int num;

        System.out.println(" Enter the number : ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        recurseinAscendingDescending(num);
    }
}
