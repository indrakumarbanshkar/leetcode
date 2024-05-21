package project.problem.loop;

import java.util.Scanner;

/*Given a number N, find its square root. You need to find and print only the
integral part of square root of N.
For eg. if number given is 18, answer is 4.*/
public class SuareRootIntegral {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=0;
        int p=0;
        while(i*i<=n)
        {
            p=i;
            i++;
        }
        System.out.println(p);
        s.close();
    }
}
