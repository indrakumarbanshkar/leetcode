package project.problem.Array;

import java.util.Scanner;
/*You have been given a random integer array/list(ARR) of size N, and an integer X.
You need to search for the integer X in the given array/list using 'Linear Search'.
 You have been required to return the index at which X is present in the array/list.
 If X has multiple occurrences in the array/list, then you need to return the index at which the
 first occurrence of X would be encountered. In case X is not present in the array/list,
  then return -1.

'Linear search' is a method for finding an element within an array/list.
It sequentially checks each element of the array/list until a match is found or
the whole array/list has been searched.*/
public class ArrayLinearSearch {
    public static int linearSearch(int arr[], int x) {
        //Your code goes here
        int num=0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,3,4,3,5,6,7,8,9,10};

        int x = 5;
        System.out.println(linearSearch(arr,x));

    }
}
