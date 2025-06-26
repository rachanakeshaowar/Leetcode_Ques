import java.util.Arrays;
import java.util.Comparator;

public class MaximumWidthRamp_962 {
 
    public int maxWidthRamp(int[] a) {
        int n = a.length;
        Integer[] idx = new Integer[n];
        
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }
        
        Arrays.sort(idx, Comparator.comparingInt(i -> a[i]));
        
        int res = 0, min = n;
        
        for (int i : idx) {
            res = Math.max(res, i - min);
            min = Math.min(min, i);
        }
        
        return res;
    }
}

  


