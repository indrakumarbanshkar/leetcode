package project.problem.loop;

import java.util.Scanner;

public class primeWithReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div=2;
        while(div<=n/2){
            if(n%div==0){
                System.out.println("composite number");
                return;
            }
            div=div+1;
        }
        System.out.println("Prime");
    }
}
