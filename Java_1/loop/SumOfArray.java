package project.problem.loop;

import java.util.Scanner;

public class SumOfArray {
    public static int [] takeInput(){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    public static int sumOfArray(int [] arr){

        int sum =0;
        for (int i = 0; i <arr.length ; i++) {
            sum =sum+arr[i] ;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr [] = takeInput();
        System.out.println(sumOfArray(arr));

    }
}
