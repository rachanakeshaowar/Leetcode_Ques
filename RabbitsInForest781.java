import java.util.HashMap;

public class RabbitsInForest781 {

    public int numRabbits(int[] a) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int res = 0;

        for (int x : a) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }

        for (int x : m.keySet()) {
            int g = x + 1;
            int c = m.get(x);
            res += ((c + x) / g) * g;
        }

        return res;
    }
}
