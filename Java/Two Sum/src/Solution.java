public class Solution {
    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        int[] result = twoSum(input, 9);
        System.out.println(result[0] + " " + result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

         return result;
    }
}
