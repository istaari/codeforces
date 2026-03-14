package impl;

/*
 * CF 158A — Next Round
 * Pattern: Implementation / threshold counting
 * Key Insight: Count scores >= k-th place score AND > 0. Ties at k-th place extend the count.
 * Edge Case: k-th score = 0 → nobody advances (must be positive)
 * Complexity: O(N)
 * I/O: Uses BufferedReader (fast I/O template)
 */

import java.io.*;
import java.util.*;

public class NextRound {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        
        // Read n and k
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        // Read scores
        st = new StringTokenizer(br.readLine());
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        
        // Get k-th place score (1-indexed k, 0-indexed array)
        int threshold = scores[k - 1];
        
        // Count participants who advance
        // Must have score >= k-th place AND score > 0
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] >= threshold && scores[i] > 0) {
                count++;
            }
        }
        
        out.println(count);
        out.flush();
        out.close();
    }
}
