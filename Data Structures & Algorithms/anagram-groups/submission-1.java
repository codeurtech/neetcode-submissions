class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();

        for(String str: strs) {

            int[] lettersCount = new int[26];

            for(int i=0;i<str.length();i++) {
                lettersCount[str.charAt(i) - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int count:lettersCount) {
                sb.append("#");
                sb.append(count);
            }

            String recipeKey = sb.toString();

            if(!map.containsKey(recipeKey)) map.put(recipeKey, new ArrayList<>());

            map.get(recipeKey).add(str);

        }

        return new ArrayList<>(map.values());
    }
}
