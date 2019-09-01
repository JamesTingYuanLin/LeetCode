package No1_Two_Sum;

//import No1_Two_Sum.bruteForce.Solution;

import No1_Two_Sum.hash.Solution;

public class Driver {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 0 , 9};
        int target = 20;
        int[] result = new Solution().twoSum(nums, target);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
