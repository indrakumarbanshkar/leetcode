package project.problem.Array;

import java.util.Scanner;

public class Arrays {

    // taking input by function and printing by function also
    public static int[] takeinput(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Enter values on index  "+i);
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void PrintArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
  /*      Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Enter element in  " + i + "  index");
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }*/

      // taking input by function and printing by function also
        int arr [ ] = takeinput();
        PrintArray(arr);

    }
}
