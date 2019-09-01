package No33_Search_in_Rotated_Sorted_Array;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int targetIndex = -1;
        int revertIndex = findRevertIndex(nums, target);
        int i = 0, j = nums.length - 1;
        if (nums.length > 2) {
            if (target > nums[nums.length - 1]) {
                j = revertIndex - 1;
            } else {
                i = revertIndex;
            }
        }
        for (int k = i; k <= j; k++) {
            if (nums[k] == target) {
                targetIndex = k;
                break;
            }
        }
        return targetIndex;

    }

    private int findRevertIndex(int[] nums, int target) {
        if (nums[nums.length - 1] >= nums[0]) {
            return 0;
        }
        int revertIndex = 0; // revertIndex.
        int i = 0, j = nums.length -1 ; // initial end indexes.

        int middleIndex = nums.length / 2;
        while (i < j) {
            if (nums[middleIndex] < nums[middleIndex - 1]) {
                revertIndex = middleIndex;
                break;
            }
            if (nums[middleIndex] > nums[j]) { // revertIndex is in the right part
                i = middleIndex;
                middleIndex = (j + i) / 2 + 1;
            } else { // // revertIndex is in the left part
                j = middleIndex;
                middleIndex = (j + i) / 2;
            }
        }
        return revertIndex;
    }
}
