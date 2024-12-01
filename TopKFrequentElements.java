class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] arr = new List[nums.length+1];

        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Integer key : map.keySet()) {
            int frequency = map.get(key);
            if(arr[frequency] == null) {
                arr[frequency] = new ArrayList<>();
            }
            arr[frequency].add(key);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i=arr.length-1; i>=0 && result.size() < k; i--) {
            if(arr[i] != null) {
                result.addAll(arr[i]);
            }
        }

        int[] answer = new int[k];

        for(int i=0; i<k; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}