public class subarray {
public static void main(String[] args){
    int[] arr={4,1,2,3};
    int count=0;
    for(int e=0; e<arr.length; e++){
        for(int s=e; s<arr.length; s++){
            int sum=0;
            for(int i=s; i<arr.length; i++){
                sum +=arr[i];
                System.out.print(arr[i]+" ");
                count++;
            }
            System.out.println("sum:"+sum);
            System.out.println();


        }
    }

    System.out.println("Total :"+count);
}


}
//count all subarray having even length

