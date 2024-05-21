package project.problem.loop;

import java.util.Scanner;

public class checkAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        // Reading the numbers
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        // Checking if the numbers form an arithmetic progression
        boolean isArithmeticProgression = true;
        int difference = numbers[1] - numbers[0];
        for (int i = 2; i < n; i++) {
            if (numbers[i] - numbers[i - 1] != difference) {
                isArithmeticProgression = false;
                break;
            }
        }
        // Outputting the result
        System.out.println(isArithmeticProgression);
    }
}
