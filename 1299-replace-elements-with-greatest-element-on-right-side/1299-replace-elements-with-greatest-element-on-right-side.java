class Solution {
    public int[] replaceElements(int[] arr) {
       
       int n=arr.length;

        int mx=arr[n-1];
        arr[n-1]=-1;
        for(int i=arr.length-2; i>=0; i--){
            int current=arr[i];
            arr[i]=mx;
            if(current>mx){
               
                mx=current;

            }
        }
return arr; 
    }
}