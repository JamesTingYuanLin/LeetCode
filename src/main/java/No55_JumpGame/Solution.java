package No55_JumpGame;

class Solution {
//    public boolean canJumpFromPosition(int position, int[] nums) {
//        if (position == nums.length - 1) {
//            return true;
//        }
//
//        int furthestJump = Math.min(position + nums[position], nums.length - 1);
//        for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
//            if (canJumpFromPosition(nextPosition, nums)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    public boolean canJump(int[] nums) {
//        return canJumpFromPosition(0, nums);
//    }

    public boolean isLast(int[] nums, int index) {
        if (index >= nums.length - 1) {
            return true;
        }
        for (int i = index; i < index + nums[index]; i++) {
            if (i + 1 < nums.length) {
                if(isLast(nums, i + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isPossible(int ioz, int[]nums) {
        boolean possible = false;
        for (int i = 0; i <= ioz; i++) {
            //            possible = false;
            for (int j = 1; j <= nums[i]; j++) {
                possible = false;
                if(i + j > ioz) {
                    return true;
                }
                //                if (nums[i + j] != 0) {
                //                    possible = true;
                //                }
            }
        }
        return possible;
    }
    public boolean canJump(int[] nums) {
        return isLast(nums, 0);
        /*
        List<Integer> indexOfZero = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                indexOfZero.add(i);
            }
        }
        boolean possible = true;
        for (int ioz: indexOfZero) {
            possible = isPossible(ioz, nums);
            if(possible == false) {
                break;
            }
        }
        return possible;

         */
        /*
        List<Integer> indexOfZero = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                indexOfZero.add(i);
            }
        }
        boolean possible = true;
        int sum = 0;
        for (int i: indexOfZero) {
            possible = true;
            sum = 0;
            for (int j = 0; j < i; j++) {
                sum += nums[j];
            }
            if(sum < i || sum >= nums.length - 1) {
                possible = false;
                break;
            }
        }
        if (nums.length == 1) possible = true;
        return possible;*/
        /*HashMap<Integer, Integer> expand = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            expand.put(i, nums[i]);
        }
        boolean can = true;
        int currentIndex = 0;
        while (can == true) {
            int nextIndex = expand.get(currentIndex);
            if (currentIndex == nums.length - 1) {
                return true;
            }
            if (nextIndex == -1) {
                return false;
            }
            expand.put(currentIndex, -1);
            currentIndex = nextIndex;
        }
        return can;
         */
    }
}