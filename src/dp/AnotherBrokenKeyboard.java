package dp;

/*
 * CF 1272B — Another Broken Keyboard ⭐
 * Pattern: DP / counting substrings (sliding count)
 * Key Insight: Track consecutive valid chars. Each new valid char at position i
 *   adds `count` substrings (all substrings ending at i). Reset count on invalid char.
 * Formula: If consecutive run has length L → contributes L×(L+1)/2 substrings
 * Edge Case: No valid chars → 0; entire string valid → N×(N+1)/2
 * Complexity: O(N + K)
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AnotherBrokenKeyboard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.nextLine();

        String s = scanner.nextLine();
        char[] available = new char[k];

        for (int i = 0; i < k; i++) {
            available[i] = scanner.next().charAt(0);
        }

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < k; i++) {
            set.add(available[i]);
        }

        long result = 0;
        long count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                count = 0;
                continue;
            }
            count++;
            result += count;
        }

        scanner.close();
        System.out.println(result);
    }

}
