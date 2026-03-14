package maths;

/*
 * CF 4A — Watermelon
 * Pattern: Math / parity check
 * Key Insight: Split w into two even parts → w must be even AND > 2
 * Edge Case: w = 2 → can't split into 1+1 (both must be even) → NO
 * Complexity: O(1)
 */

import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();

        if (w % 2 == 0 && w > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
