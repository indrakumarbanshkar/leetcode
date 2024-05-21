package project.problem.loop;

import java.util.Scanner;
/* Write a program that asks the user for a number N and a choice C. And then give them the
possibility to choose between computing the sum and computing the product of all
integers in the range 1 to N (both inclusive).
If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes) */
public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int c= sc.nextInt();
        int i=1;
        int sum=0;
        int mul=1;
    /*    while(i<=n){
            sum=sum+i;
            i++;
        } */
     /*   int j=1;
        while(j<=n){
            mul=mul*j;
            j++;
        } */
        if(c==1){ while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
        }
        if(c==2) {
            int j=1;
            while(j<=n){
                mul=mul*j;
                j++;
            }
            System.out.println(mul);
        }
        else{
            System.out.println(-1);
        }
    }

}
