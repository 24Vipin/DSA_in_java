import java.util.Scanner;
public class Remove_Ele {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr ={10,20,30,40};
        int n=arr.length;

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Enter index(0 to 3): ");
        int pos=sc.nextInt();

        int[] arr1=new int[n-1];
        int j=0;
        for(int i=0; i<n;i++){
            if(i==pos){
            continue;
            }
            arr1[j]=arr[i];
            j++;
        }
        System.out.println("New Array: ");
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
        sc.close();
    }
}
