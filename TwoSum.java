class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int[] arr2 = new int[2];
        int[] nums2 = new int[nums.length];
        int firstElementFoundFlag = 0;
        
        //traversing the array and copying the original array in this
        for(int i=0; i<nums.length; i++) {
            nums2[i] = nums[i];
        }

        //sorting it
        Arrays.sort(nums2);

        //two pointer approach to get the pair of numbers in the array 'arr'
        int i = 0;
        int j = nums2.length-1;
        while(i < j) {
            int sum = nums2[i] + nums2[j];
            if(sum == target) {
                arr[0] = nums2[i];
                arr[1] = nums2[j];
                break;
            }
            else if(sum < target) {
                i++;
            }
            else {
                j--;
            }
        }


        /*
	arr contains the list of numbers required now. we now check the indices
        of the numbers in arr. we then return the indicesin another array called 
        arr2
	*/

        for(int k=0; k<nums.length; k++) {
            if(nums[k] == arr[0] && firstElementFoundFlag == 0) {
                arr2[0] = k;
                firstElementFoundFlag = 1;
            }
            else if(nums[k] == arr[1]) {
                arr2[1] = k;
            }
        }

        return arr2;

    }
}