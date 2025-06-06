import java.util.*;
public class MinimumDominoRotationsForEqualRow {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int result1 = check(tops, bottoms);
        int result2 = check(bottoms, tops);

        if (result1 == -1 && result2 == -1) return -1;
        if (result1 == -1) return result2;
        if (result2 == -1) return result1;

        return Math.min(result1, result2);
    }

   
    private int check(int[] a, int[] b) {
        Map<Integer, Integer> freq = new HashMap<>();

    
        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        
        int maxKey = -1;
        int maxFreq = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxKey = entry.getKey();
                maxFreq = entry.getValue();
            }
        }

       
        int swaps = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == maxKey) continue;
            else if (b[i] == maxKey) swaps++;
            else return -1; 
        }

        return swaps;
    }
}




