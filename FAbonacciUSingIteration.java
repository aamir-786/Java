public class FAbonacciUSingIteration {
    public static void  recurseiterate(int n){
        if(n==1 || n==2){
            System.out.println(1);

        }
        System.out.print(" 0 1 1 ");
        int a=1,b=1,c=0;
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+ " ");
        }
    }
    public static void main(String[] args) {

        recurseiterate(10);
    }
}
