class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<String> list1 = new ArrayList<>();
        List<List<String>> result = new ArrayList<List<String>>();
        for(int i=0; i<strs.length; i++) {
            List<String> list1 = new ArrayList<>();
            if(strs[i] == "0") {
                continue;
            }
            list1.add(strs[i]);
            for(int j=i+1; j<strs.length; j++) {
                if(ifAnagram(strs[i], strs[j])) {
                    list1.add(strs[j]);
                    strs[j] = "0";
                }
            }
            strs[i] = "0";
            result.add(list1);
        }
        return result;
    }

    public boolean ifAnagram(String word1, String word2) {
        if(word1.length() != word2.length()) {
            return false;
        }

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}