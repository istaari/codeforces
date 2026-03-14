package greedy;

/*
 * CF 231A — Team
 * Pattern: Greedy / counting
 * Key Insight: 3 people per problem, need >= 2 confident → sum of 3 values >= 2
 * Edge Case: All zeros → count = 0; all ones → count = N
 * Complexity: O(N)
 */

import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();

            if (petya + vasya + tonya >= 2) {
                count++;
            }
        }
        scanner.close();
        System.out.println(count);
    }
}
