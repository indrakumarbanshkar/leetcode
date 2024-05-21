package project.problem.loop;

import java.util.Scanner;
/*Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros,
 then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.*/
public class ReverseNumber {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res=0;
        while(n>0){
            int a=n%10;
            res= res*10+a;
            n=n/10;
        }
        System.out.println(res);
    }
}
