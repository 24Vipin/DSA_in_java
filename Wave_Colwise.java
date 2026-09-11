public class Wave_Colwise {
    public static void ColWave(int arr[][]){
        int row= arr.length;
        int col= arr[0].length;
        for(int j=0; j<col;j++) {
            if (j % 2 == 0){
            for (int i = 0; i < row; i++) {

                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }


            else{
                for(int i=row-1; i>=0; i--){
                    System.out.print(arr[i][j]+" ");
                }

                System.out.println();
            }

        }
    }
    public static void main(String[] args){
        int[][] arr={
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        ColWave(arr);
    }
}
