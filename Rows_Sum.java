public class Rows_Sum {
    public static int[] SumOfElement_arr(int arr[][]){
        int row=arr.length;
        int col=arr[0].length;
        int sum=0;

        int[] result=new int[row];
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                sum=sum+arr[i][j];

            }
            result[i]=sum;
        }
        return result;
    }
    public static void main(String[] args){
        int[][] arr= {
                {10,20,30},
                {40,50,60},
                {70,80,90}

        };
       int[] arr1= SumOfElement_arr(arr);
        System.out.print(" sum of Array: ");
        for(int i=0; i<arr1.length; i++){
            System.out.print(
                    arr1[i]+" ");
        }
    }
}
