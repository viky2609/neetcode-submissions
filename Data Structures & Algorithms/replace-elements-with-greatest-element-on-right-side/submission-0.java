class Solution {
    public int[] replaceElements(int[] arr) {
       // int i =0,j= arr.length;
       int max=-1;
        for(int i=0;i<arr.length;i++){
         max=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }arr[i]=max;
        }
       
        return arr;
    }
}