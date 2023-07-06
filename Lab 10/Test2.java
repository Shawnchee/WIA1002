public class Test2 {
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

        private static String binarySearch(int[] arr4, int target) {
            return null;
        }

        private static void insertionSort(int[] arr2) {
         
            
        }

        private static void selectionSort(int[] arr3) {
            
            }
        }
            
        

        private static void bubbleSort(int[] arr) {
         
        }

