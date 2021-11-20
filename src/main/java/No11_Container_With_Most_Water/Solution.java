package No11_Container_With_Most_Water;

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxCapacity = 0;

        while (left < right) {
            int horizon = right - left;
            int vertical = Math.min(height[left], height[right]);
            int capacity = horizon * vertical;
            maxCapacity = Math.max(maxCapacity, capacity);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxCapacity;

        /* brute solution
        int maxCapacity = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int horizon = j - i;
                int vertical = Math.min(height[i], height[j]);
                int capacity = horizon * vertical;
                maxCapacity = Math.max(maxCapacity, capacity);
            }
        }
        return maxCapacity;
        */
    }
}
