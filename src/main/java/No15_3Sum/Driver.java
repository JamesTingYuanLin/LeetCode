package No15_3Sum;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        int[] input = {-1, 0, 1, 2, -1, -4};
        for (List<Integer> l : new Solution().threeSum(input)) {
            System.out.println(l);
        }
    }
}
