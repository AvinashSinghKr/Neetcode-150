class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = nums[0];
        right[nums.length-1] = nums[nums.length-1];

        for(int i=1; i<nums.length; i++) {
            left[i] = nums[i] * left[i-1];
        }

        for(int i=nums.length-2; i>=0; i--) {
            right[i] = nums[i] * right[i+1];
        }

        int[] answer = new int[nums.length];

        answer[0] = right[1];
        answer[nums.length-1] = left[nums.length-2];

        for(int i=1; i<nums.length-1; i++) {
            answer[i] = right[i+1] * left[i-1];
        }

        return answer;
    }
}