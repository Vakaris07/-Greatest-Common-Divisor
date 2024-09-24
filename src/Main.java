//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        int min = Math.min(first, second);
        int GCD = 1;
        for (int i = 1; i <= min; i++) {
            if (first % i == 0 && second % i == 0) {
                GCD = i;
            }
        }
        return GCD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the second number: ");
        int second = sc.nextInt();
        System.out.println("Greatest common divisor (GCD): " + getGreatestCommonDivisor(first, second));


    }


}