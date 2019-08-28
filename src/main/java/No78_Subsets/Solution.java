package No78_Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsets(int[] nums) {
        getFromRemained(new ArrayList<Integer>(), nums, 0);
        return result;
    }

    private void getFromRemained(List<Integer> selected, int[] nums, int currentIndex) {
        if (currentIndex == nums.length) {
            result.add(selected);
            return;
        }
            //not select
            List<Integer> selectedAfterSelection = new ArrayList<Integer>(selected);
            getFromRemained(selectedAfterSelection, nums, currentIndex + 1);

            // select
            selectedAfterSelection = new ArrayList<Integer>(selected);
            selectedAfterSelection.add(nums[currentIndex]);
            getFromRemained(selectedAfterSelection, nums, currentIndex + 1);
    }
}
