package project.problem.Array;

import java.util.Scanner;

/* print all the prime members which are lies bt 2 to N */
public class AllPrimeNumbers {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();

        for(int i=2;i<=n;i++){
            int count=0;
            for(int j=2;j<=i;j++){
                if(i%j==0) {
                    count++;
                }
            }
            if(count==1) {
                System.out.println(i);
            }
        }

    }
}
