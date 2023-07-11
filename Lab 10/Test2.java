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

        mergeSort(arr3);
        System.out.println("\nAfter sorting(mergesort):");
        for (int i : arr3){
            System.out.print(i + " ");
        }

         int [] arr4 = {45, 7, 2, 8, 19, 3};
         int target = 3 ;
         System.out.println("\nTarget of " + target + " at index " +  binarySearch(arr4,target));

}

        private static void mergeSort(int[] arr) {
            if (arr.length>1){
           int [] firstHalf = new int [arr.length/2];
           System.arraycopy(arr, 0, firstHalf, 0, arr.length/2);
           mergeSort(firstHalf);

           int secondHalfLength = arr.length - (arr.length/2);
           int [] secondHalf = new int [secondHalfLength];
           System.arraycopy(arr, arr.length/2, secondHalf,0, secondHalfLength);
            mergeSort(secondHalf);

            merge(firstHalf,secondHalf,arr);
           
            }
        }

        private static void merge(int[] arr1, int[] arr2, int[] temp) {
            int current1 =0 ;
            int current2 = 0;
            int current3 = 0 ;

            while (current1 < arr1.length && current2 < arr2.length ){
                if (arr1[current1] < arr2[current2])
                temp[current3++] = arr1[current1++];
                else
                temp[current3++] = arr2[current2++];
            }

            while (current1 < arr1.length){
            temp[current3++] = arr1[current1++];
            }

            while (current2< arr2.length){
            temp[current3++] = arr2[current2++];
            }
        }
        

        private static String binarySearch(int[] arr4, int target) {
            return null;
        }

        private static void insertionSort(int[] arr) {
         for (int i =1 ; i < arr.length ; i ++){
            int min = arr[i];
            int k = i - 1;
            while (k >= 0 && arr[k] > min){
                arr[i] = arr[k];
                i--;
                k--;
            }
            arr[k+1] = min ; 
         }
            
        }

        private static void selectionSort(int[] arr) {
            for (int i = 0 ; i < arr.length ; i ++){
                int min = i ; 
                for (int j = i +1; j<arr.length ; j ++){
                    if (arr[min] > arr[j]){
                        min = j;
                    }
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;

            }
            }
        
            
        

        private static void bubbleSort(int[] arr) {
         for (int i = 0 ; i  < arr.length ; i ++){
            for (int j = 0 ; j <arr.length -1 -i ; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
         }
        }
}

