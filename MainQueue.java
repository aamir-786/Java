import java.util.*;


    public class MainQueue {

        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            QUEUE q1 = new QUEUE();
            q1.enqueue();


        }

        class QUEUE {
            int r = -1;
            int f = -1;
            int n = 10;

            /* public QUEUE(int r, int f) {
                 this.r = r;
                 this.f = f;
             }
         */
            int queue[] = new int[n];

            public void enqueue() {
                if (f == n - 1) {

                    System.out.println(" Queuw is full ");
                } else {
                    System.out.println("Enter data : ");
                    int input;
                    Scanner sc = new Scanner(System.in);
                    input = sc.nextInt();
                    if (r == -1 && f == -1) {
                        r = 0;
                        f = 0;
                        queue[r] = input;
                    } else {

                        r = r + 1;
                        queue[r] = input;
                        System.out.println("Data is added to queue");
                    }
                }
            }

        }
    }

