// Find the missing number in a sequence of numbers from 1 to n.

import java.util.Scanner;
public class FindMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 0;
        int a = (n * (n + 1)) / 2;
        
        for (int i = 1; i < n; i++) s += sc.nextInt();
        System.out.printf("The missing number is %d", a - s);
        sc.close();
    }
}
