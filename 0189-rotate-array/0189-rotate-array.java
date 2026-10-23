class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length;
       k=k%n;
       reverse(nums,0,n-k-1);
       reverse(nums,n-k,n-1);
       reverse(nums,0,n-1);
    }
       public void reverse(int[] nums, int start, int last){
        while(start<last){
            int temp=nums[start];
            nums[start]=nums[last];
            nums[last]=temp;
            start++;
            last--;
        }
       
    }
}