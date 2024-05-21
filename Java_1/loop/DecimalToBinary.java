package project.problem.loop;

import java.util.Scanner;

/*Given a decimal number (integer N), convert it into binary and print.

Note for C++ coders:
Do not use the inbuilt implementation of "pow" function.
The implementation of that function is done for 'double's and it may fail when used
for 'int's, 'long's, or 'long long's. Implement your own "pow" function to work for
non-float data types.
The given input number could be large, so the corresponding binary number can
exceed the integer range. So you may want to take the answer as long for CPP and Java. */
public class DecimalToBinary {
    public void Binary(int num){
        if(num==0){
            System.out.print("0");
            return;
        }
        int binary[] = new int[40];
        int index=0;
        while(num>0){
            binary[index++]=num%2;
            num=num/2;
        }
        for(int i=index-1; i>=0 ; i--){
            System.out.print(binary[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalToBinary obj = new DecimalToBinary();
        int n=sc.nextInt();
        obj.Binary(n);

    }
}
