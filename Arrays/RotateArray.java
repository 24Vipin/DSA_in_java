import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        System.out.println("Original arr: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter any index no.: ");
        int a = sc.nextInt();

        a = a % n;
        reverse(arr, 0, n - a - 1);
        reverse(arr, n - a, n - 1);
        reverse(arr, 0, n - 1);

        System.out.println("Rotated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int[] arr,int start,int last){
        while(start<last){
            int temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
            start++;
            last--;
        }

    }

}
