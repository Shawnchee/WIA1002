public class Q1 {
    public static void main(String[] args) {
        int [] arr = {45, 7, 2, 8, 19, 3 };

        selectionSortSmallest(arr);
        System.out.println("After sorting:");
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void selectionSortSmallest(int[] arr) {
        for (int i = 0 ; i < arr.length ; i ++){
            int min = i ; 
            for (int j = i +1 ; j <arr.length ; j ++){
                if (arr[min] > arr[j]){
                    min = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
        
    }       
}
}

