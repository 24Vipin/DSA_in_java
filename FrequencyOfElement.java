public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 10, 40, 20};

        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        boolean[] visited = new boolean[arr.length];

        System.out.println("\nElement Frequencies:");
        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

          
            System.out.println("Element " + arr[i] + " appears " + count + " time(s).");
        }
    }
}