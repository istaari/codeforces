package maths;

/*
 * CF 50A — Domino Piling
 * Pattern: Math / area division
 * Key Insight: Each domino covers 2 cells → answer is (m * n) / 2
 * Edge Case: 1×1 grid → 0 dominoes
 * Complexity: O(1)
 */

import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        sc.close();
        System.out.println((m * n) / 2);
    }
}
