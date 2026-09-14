// Calculate the sum of all digits in a given number.

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 0;

        while (n != 0) {
            s += n % 10; n /= 10;
        } System.out.printf("The sum of digits is %d", s);
        sc.close();
    }
}
