public class bubbleSort {
    public static void main(String[] args) {
        int [] arr = {45, 7, 2, 8, 19, 3};

        bubbleSort(arr);
        System.out.println("After sorting:");
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0 ; i < arr.length; i ++){ 
            for (int j = 0 ; j < arr.length-i-1; j ++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

    }
}

