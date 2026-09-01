import java.util.Scanner;
public class In_Num_indx {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr={10, 20,30,40,50};
    int n=arr.length;
    for(int i=0; i<n; i++){
        System.out.println(arr[i]);
    }
    System.out.println("Enter index no.: ");
    int x=sc.nextInt();

    System.out.println("Enter element: ");
    int y=sc.nextInt();

    System.out.println(x);
    System.out.println(y);
    
    int[] arr1=new int[n+1];
    int j=0;

    for(int i=0; i<arr1.length; i++ ){

    if(i==x){
        arr1[i]=y;
    }
    else{
        arr1[i]=arr[j];
        j++;
    }

    }
    System.out.println(" Array after insertion: ");
    for(int i=0; i<arr1.length; i++){
        System.out.print(arr1[i]+" ");
    }
    sc.close();
}
}
