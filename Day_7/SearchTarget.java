// Search the target Element (Linear vs Binary Search) in a given array.

import java.util.ArrayList;
import java.util.Scanner;

public class SearchTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lt = new ArrayList<>();
        while (sc.hasNextInt()) {
            int input = sc.nextInt();
            lt.add(input);
        }
        int[] arr = lt.stream().mapToInt(i -> i).toArray();
        int t = sc.nextInt();

        // for (int a : arr) if (a==t) System.out.println("True"); // Linear Search

        int l = 0, h = arr.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] == t)
                System.out.println("Found");
            else if (arr[m] < t)
                l = m + 1;
            else
                h = m - 1;
        }
        System.out.println("Not Found");
        sc.close();
    }
}