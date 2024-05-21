package project.problem.loop;

import java.util.Scanner;

public class checkPallindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num= n;
        int res= 0;
        while(n>0){
            int a= n%10;
            res= res*10 +a;
            n=n/10;
        }
        System.out.println(num);
        System.out.println(res);

        if(num==res){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
