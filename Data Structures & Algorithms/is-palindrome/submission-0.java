class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll(" ","");
        str = str.replaceAll("[^a-zA-Z0-9]","");
        str = str.toLowerCase();

        for(int i=0;i<str.length();i++) {
            int j=str.length()-i-1;
            if(str.charAt(i)!=(str.charAt(j))) {
                return false;
            }
        }

        return true;
    }
}
