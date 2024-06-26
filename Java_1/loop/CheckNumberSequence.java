package project.problem.loop;

import java.util.Scanner;

/*You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one.

Note : We say that x is strictly larger than y when x > y. So, a strictly increasing sequence can be 1 4 8. However, 1 4 4 is NOT a strictly increasing sequence.


That is, in the sequence if numbers are decreasing, they can start increasing at one point. Thereafter, they cannot decrease at any point further.

Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. So, in both the cases, print true.


You just need to print true/false. No need to split the sequence.*/
public class CheckNumberSequence {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n= s.nextInt();
        if(n==0){
            System.out.print("false");
            return;
        }
        int b=0;
        int pre = s.nextInt();
        int i=1;
        boolean isDec=true;
        int a=0;
        if(n<=0||n==1){
            a=1;
        }while(i<n){
            int current = s.nextInt();
            if(pre==current){
                a=1;
            }else if(pre>current){
                if(isDec){
                    pre=current;
                }
                else if(b==1 ){
                    a=1;
                }else{
                    a=1;
                }
            }else if(pre<current){
                isDec= false;
                pre=current;
                b=1;
            }
            i++;
        }
        if(a==0){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}
