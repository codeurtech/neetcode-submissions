class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str:strs) {
            sb.append(str.length()).append("#").append(str);
          
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strList = new ArrayList<>();
        int i=0;
        while(i<str.length()) {
            int j=i;
            while(str.charAt(j)!='#') {
                j++;
            }
            int length = Integer.valueOf(str.substring(i,j));
            strList.add(str.substring(j+1, j+1+length));
            i=j+length+1;
        }
        return strList;
    }
}
