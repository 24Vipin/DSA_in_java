class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int MaxOne=0;
       int count=0;
       for(int i=0; i<nums.length; i++){
        if(nums[i]==1){
            count++;
            MaxOne=Math.max(MaxOne,count);
        }
        else{
            count=0;
        }
       } 
       return MaxOne;
    }
}