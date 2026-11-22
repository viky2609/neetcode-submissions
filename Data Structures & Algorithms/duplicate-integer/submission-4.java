class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i=0;
        int j=1;
        Arrays.sort(nums);
        while(j<nums.length){
            if(nums[i]==nums[j]){
                return true;
            }
            i++;
            j++;
        }return false;
    }
}