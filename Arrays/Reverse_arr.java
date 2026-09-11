import java.util.Scanner;
public class Reverse_arr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

//        // Using two pointer approach
//    int[] arr={10,20,30,40,50};
//    int n=arr.length;
//
//    for(int i=0; i<n; i++){
//        System.out.println(arr[i]+" ");
//    }
//    int start=0;
//    int last=arr.length-1;
//
//    while(start<last){
//        int temp=arr[start];
//        arr[start]=arr[last];
//        arr[last]=temp;
//        start++;
//        last--;
//    }
//
//        System.out.println("Reverse number:");
//        printArray(arr);
//    }
//    public static void printArray(int[] arr){
//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }

        // Using Extra space

        int[] arr={10,20,30,40,50};
           int n=arr.length;

        for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] arr1=new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=arr[n-1-i];
        }

        System.out.println("Reverse array: ");
        printArray(arr1);

    }
    public static void printArray(int[] arr1){
        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }
    }

}
