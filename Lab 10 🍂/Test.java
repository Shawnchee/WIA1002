public class Test {
        public static void main(String[] args) {
        int [] arr = {45, 7, 2, 8, 19, 3};

        bubbleSort(arr);
        System.out.println("After sorting(bubblesort):");
        for (int i : arr){
            System.out.print(i + " ");
        }

        int [] arr2 = {45, 7, 2, 8, 19, 3};

        insertionSort(arr2);
        System.out.println("\nAfter sorting(insertionsort):");
        for (int i : arr2){
            System.out.print(i + " ");
        }

         int [] arr3 = {45, 7, 2, 8, 19, 3};

        selectionSort(arr3);
        System.out.println("\nAfter sorting(selectionsort):");
        for (int i : arr3){
            System.out.print(i + " ");
        }

         int [] arr4 = {45, 7, 2, 8, 19, 3};
         int target = 3 ;
         System.out.println("\nTarget of " + target + " at index " +  binarySearch(arr4,target));

}


        private static int binarySearch(int[] arr4, int i) {
            int low = 0, high = arr4.length-1;
            while (low <= high){
                int middle = (low+high)/2;

                if (arr4[middle]==i) return middle;

                else if (arr4[middle] > i) high = middle -1 ;

                else low = middle + 1;
            }
            return  -1;
        }


        private static void insertionSort(int[] arr) {
            for (int i = 1 ; i < arr.length ; i ++){
                int min = arr[i];
                int k = i-1;
                while (k >= 0 && arr[k] > min){
                    arr[i]=  arr[k];
                    k--;
                    i--;
                }
                arr[k+1] = min;
            }
        }

        private static void selectionSort(int[] arr) {
            for (int i = 0 ; i < arr.length ; i ++){
                int min = i ;
                for (int j = i+1 ; j <arr.length ; j++){
                    if (arr[min] > arr[j])
                    min = j ; 
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }


        private static void bubbleSort(int[] arr) {
             for (int i = 0 ; i < arr.length ; i ++){
                for (int j =0 ; j <arr.length-i-1; j++){
                    if (arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
}
