import java.util.*;

class largestGroupHavingSameSumSolution_1399 {
    public int countLargestGroup(int num) {
        HashMap<Integer, Integer> grp = new HashMap<>();
        int max = 0;

        for (int val = 1; val <= num; val++) {
            int sum = getSum(val);
            grp.put(sum, grp.getOrDefault(sum, 0) + 1);
            max = Math.max(max, grp.get(sum));
        }

        int cnt = 0;
        for (int freq : grp.values()) {
            if (freq == max) {
                cnt++;
            }
        }

        return cnt;
    }

    private int getSum(int val) {
        int sum = 0;
        while (val > 0) {
            sum += val % 10;
            val /= 10;
        }
        return sum;
    }
}
 



