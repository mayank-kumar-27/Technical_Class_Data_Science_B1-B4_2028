// check whether a given number is prime or not.

import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Not prime");
            sc.close(); return;
        }
        if (n == 2) {
            System.out.println("Its a Prime");
            sc.close(); return;
        }
        if (n % 2 == 0){
            System.out.println("Not prime");
            sc.close(); return;
        }

        boolean p = true;
        for (int i = 3; i * i <= n; i+=2) {
            if (n % i == 0) {
                p = false;
                break;
            }
        } System.out.print(p ? "Its a Prime" : "Not Prime");
        sc.close();
    }
}