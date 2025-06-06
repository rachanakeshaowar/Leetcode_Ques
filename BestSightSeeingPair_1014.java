import java.util.*;
public class BestSightSeeingPair_1014 {
  
    public int maxScoreSightseeingPair(int[] A) {
        int res = Integer.MIN_VALUE;
        int best = A[0];  // best = max(A[i] + i)

        for (int j = 1; j < A.length; j++) {
            res = Math.max(res, best + A[j] - j);
            best = Math.max(best, A[j] + j);
        }

        return res;
    }
}

  

