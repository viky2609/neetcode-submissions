class Solution {
    public int longestPalindrome(String s) {
        Set<Character> see= new HashSet<>();
        int r=0;
        for(char c: s.toCharArray()){
            if(see.contains(c)){
                see.remove(c);
                r+=2;
            }else see.add(c);
        }
        return see.isEmpty() ? r:r+1;
    }
}