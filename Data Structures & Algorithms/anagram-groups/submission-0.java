class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        boolean[] isAlreadyGrouped = new boolean[strs.length];

        List<List<String>> result = new ArrayList<>();

        for(int i=0; i<strs.length; i++) {

            if(isAlreadyGrouped[i]) continue;

            List<String> currentGroup = new ArrayList<>();

            currentGroup.add(strs[i]);
            isAlreadyGrouped[i] = true;

            for(int j=i+1;j<strs.length;j++) {
                if(isAnagram(strs[i],strs[j])) {
                    currentGroup.add(strs[j]);
                    isAlreadyGrouped[j] = true;
                }
            }

            result.add(currentGroup);
        }
        return result;
    }

    public boolean isAnagram(String s1, String s2) {

        if(s1.length()!=s2.length()) return false;

        int[] letterCounts = new int[26];

        for(int i=0;i<s1.length();i++) {
            int slotIndex = s1.charAt(i) - 'a';
            letterCounts[slotIndex]++;
        }

        for(int i=0;i<s2.length();i++) {
            int slotIndex = s2.charAt(i) - 'a';
            letterCounts[slotIndex]--;
        }

        for(int count:letterCounts) {
            if(count!=0) return false;
        }

        return true;
    }
}
