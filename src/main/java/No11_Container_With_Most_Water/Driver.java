package No11_Container_With_Most_Water;

public class Driver {
    public static void main(String[] args) {
        int[] input = {1,8,6,2,5,4,8,3,7};
//        int[] input = {4,3,2,1,4};
//        int[] input = {1,1};
//        int[] input = {1,2,1};

        Solution s = new Solution();
        System.out.println(s.maxArea(input));
    }
}
