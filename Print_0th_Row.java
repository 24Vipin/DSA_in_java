public class Print_0th_Row {
    public static void ZeroRow(int arr[][]){
        for(int j=0; j< arr[0].length;j++){
            ;

                System.out.print(arr[0][j]+" ");

        }
    }
    public static void main(String[] args){
        int[][] arr= {{10,20,30},{40,50,60},{70,80,90}};
        ZeroRow(arr);
    }
}
