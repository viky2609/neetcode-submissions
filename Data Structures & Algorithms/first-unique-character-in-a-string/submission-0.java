class Solution {
    public int firstUniqChar(String s) {
        //char ch[] = s.toCharArray();
       HashMap<Character,Integer> visited = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
               visited.put(ch,visited.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
         char ch = s.charAt(i);
         if(visited.get(ch)==1){
            return i;
         }
        }return -1;
    }
}