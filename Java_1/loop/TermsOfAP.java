package project.problem.loop;

import java.util.Scanner;
/*Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.*/
public class TermsOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n=1;
        int c=1;
        while(n<=x){
            c=3*n+2;
            if(c%4!=0){
                System.out.println(c);
            }
            n++;
        }

    }
}
