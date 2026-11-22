class Solution {
    public boolean isAnagram(String s, String t) {
char [] str =s.toCharArray();
        char [] tt= t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(tt);
        if(str.length!=tt.length){
            return false;
        }else{
             for(int i =0;i<str.length;i++){
                if(str[i]!=tt[i]){
                    return false;
                }
            }
        }return true;
    }
}
