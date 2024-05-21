package project.problem.loop;

import java.util.Scanner;
/* NcR  -- n!/r!*(n-r)! */
public class CalculateNcR {

    public static int factorial(int num){
       int  fact = 1;
        for (int i = 1; i <=num ; i++) {
            fact= fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();
        int factN= factorial(n);
        int factR= factorial(r);
        int factNR= factorial(n-r);
        int result= factN/(factR*factNR);
        System.out.println(result);



    /*    int factN= 1;
        for (int i = 1; i <= n; i++) {
            factN=factN*i;
        }
       int  factR=1;
        for (int i = 1; i <=r ; i++) {
            factR=factR*i;
        }
        int factNR=1;
        for (int i = 1; i <=(n-r) ; i++) {
            factNR= factNR*i;
        }
        int result = factN/(factR*factNR);
        System.out.println(result);   */
       /* System.out.println(factNR);
        System.out.println(factN);
        System.out.println(factR);*/




    }
}
