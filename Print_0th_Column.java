public class Print_0th_Column {
        public static void ZeroColumn(int arr[][]){
        for(int i=0; i< arr.length;i++){
            ;

            System.out.print(arr[i][0]+" ");

        }
    }
        public static void main(String[] args){
        int[][] arr= {{10,20,30},{40,50,60},{70,80,90}};
        ZeroColumn(arr);
    }

}
