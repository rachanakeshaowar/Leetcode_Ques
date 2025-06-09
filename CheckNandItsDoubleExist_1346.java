import java.util.*;
class Solution {
    public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int zeroCount = 0;

        for (int x : arr) {
            if (x == 0) zeroCount++;
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        if (zeroCount >= 2) return true;

        for (int x : arr) {
            if (x != 0 && map.containsKey(2 * x)) {
                return true;
            }
        }

        return false;
    }
}