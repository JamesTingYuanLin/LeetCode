package No15_3Sum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
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
    }

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
}

