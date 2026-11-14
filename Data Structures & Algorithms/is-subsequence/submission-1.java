class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=0;
        int right=0;
        while(l<s.length()&&right <t.length()){
            if(s.charAt(l)==t.charAt(right)){
                l++;
            }right++;
        }return l== s.length();
    }
}