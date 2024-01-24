public class FAbonacciSeries
{
    public static int fabonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fabonacci(n-1)+fabonacci(n-2);
        }

    }
    public static void main(String[] args) {
        int n =10;
        System.out.println("The Fibonacci Series:");
         for (int i = 0; i < n; i++){
             System.out.print(" "+ fabonacci(i));
         }
    }
}
