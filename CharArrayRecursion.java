public class CharArrayRecursion {
    public static void recursionCharArray(char A[] , int index){

        if(index==0) {
            return;
        } else {
            System.out.print(" " +A[index-1] + " ");
            recursionCharArray(A, index-1);
        }
    }
    public static void main(String[] args) {
        char A[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        recursionCharArray(A, A.length);

        if (A.length == 0) {
            return;
        } else {
            System.out.print(" "+ A[A.length - 1]);
            recursionCharArray(A, A.length - 1);
        }

    }
}
