import java .util.Scanner;
public class SumOfElement_arr {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the arr: ");
         int n=sc.nextInt();

         int[] arr=new int[n];

         for(int i=0; i<n; i++){
             System.out.print("Enter element of the array: ");
             arr[i]=sc.nextInt();
         }

        System.out.println(" Original Array : ");
         for(int i=0; i<arr.length; i++){
             System.out.print(arr[i]+" ");
         }
        System.out.println();
         int sum=0;
         for(int i=0; i<arr.length; i++){
             sum=sum+arr[i];
         }

        System.out.println(" Sum of Array:"+ sum);

    }


}
