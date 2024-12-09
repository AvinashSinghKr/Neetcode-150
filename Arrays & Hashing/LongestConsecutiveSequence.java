class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int currentMax = 1;
        int totalMax = 1;
        Set<Integer> setList = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++) {
            setList.add(nums[i]);
        }

        for(int i=0; i<nums.length; i++) {
            int var = nums[i];
            if(setList.contains(var-1)) {
                continue;
            }
            else {
                while(setList.contains(var+1)) {
                    currentMax++;
                    if(currentMax > totalMax) {
                        totalMax = currentMax;
                    }
                    var = var+1;
                }
            }
            currentMax = 1;
        }

        return totalMax;

    }
}
