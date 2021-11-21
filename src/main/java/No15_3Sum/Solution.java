package No15_3Sum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int left = 1;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                if (0 == nums[i] + nums[left] + nums[right]) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < nums.length && nums[left] == nums[left - 1]) left++;
                    while (right >= 0 && nums[right] == nums[right + 1]) right--;
                } else if (0 > nums[i] + nums[left] + nums[right]) {
                    left++;
                } else if (0 < nums[i] + nums[left] + nums[right]) {
                    right--;
                }
            }
        }
        return result;

        /* brute solution

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Set<ArrayList<Integer>> uniqueReult = new HashSet<ArrayList<Integer>>();
        Map<Set<Integer>, Integer> twoSum = getTwoSum(nums);
        for (int i = 0 ; i< nums.length; i++) {
            for (Set<Integer> key : twoSum.keySet()) {
                if (key.contains(i)) continue;
                if (twoSum.get(key) + nums[i] == 0) {
//                    if (key == null) {
//                        System.out.println();
//                    }
                    List<Integer> threeNumIndex = new ArrayList<Integer>(key);
                    threeNumIndex.add(i);
                    ArrayList<Integer>threeNum = new ArrayList<Integer>();
                    for (int indexOfResult: threeNumIndex) {
                        threeNum.add(nums[indexOfResult]);
                    }
                    Integer[] a = new Integer[3];
                    Arrays.sort(threeNum.toArray(a));
                    uniqueReult.add(new ArrayList<Integer>(Arrays.asList(a)));
                }
            }
        }
        for (ArrayList<Integer> s :uniqueReult) {
            result.add(new ArrayList<Integer>(s));
        }
        return result;

         */
    }

    /* brute solution

    private Map<Set<Integer>, Integer> getTwoSum(int[] nums) {
        Map<Set<Integer>, Integer> twoSum = new HashMap<Set<Integer>, Integer>(); // index, sum
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                Set<Integer> indexSet = new TreeSet<Integer>();
                indexSet.add(i);
                indexSet.add(j);
                twoSum.put(indexSet, nums[i] + nums[j]);
            }
        }
        return twoSum;
    }

     */
}

