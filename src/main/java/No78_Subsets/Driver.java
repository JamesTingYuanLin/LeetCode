package No78_Subsets;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
//        int[] nums = {1, 2};
//        int[] nums = {1, 2, 2};
//        int[] nums = {1};
//        int[] nums = {};
        List<List<Integer>> result = new Solution().subsets(nums);
        for (List l: result) {
            System.out.println(l);
        }
    }
}
