// Reverse the digits of a given number.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 0;

        while (n != 0) {
            s = s * 10 + n % 10; n /= 10;
        } System.out.printf("The Reversed No is %d", s);
        sc.close();
    }
}
