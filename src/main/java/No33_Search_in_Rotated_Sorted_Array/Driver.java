package No33_Search_in_Rotated_Sorted_Array;

public class Driver {
    public static void main(String[] args) {
//        int[] nums= {4,5,6,7,0,1,2};
        int[] nums = {3, 5, 1};
//        int[] nums = {};
//        int[] nums = {0};
//        int[] nums = {1, 3};
        int target = 6;

        Solution s = new Solution();
        System.out.print(s.search(nums, target));
    }
}
