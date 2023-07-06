public class binarySearch {
    public static void main(String[] args) {
        int [] array = {2,3,6,7,1,5,9,8};
        bubblesort(array);
        System.out.println("After sorting in ascending order: " );
        for (int i : array){
            System.out.print(i + " ");
        }
        int target = 9;
        int result = BinarySearch(array, target);
        if (result != -1)
        System.out.println("\n" + target+" is found at index: " + result);
        else
        System.out.println(target + " is not found.");

    }

    private static void bubblesort(int[] array) {
        for (int i = 0 ; i < array.length ; i ++){
            for (int j = 0 ; j < array.length -1 - i ; j ++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        }
    }

    public static int BinarySearch(int[] array, int target) {
        int low  = 0, high = array.length-1 ;

        while (low <= high){
            int middle = (low+high)/2;
            if (array[middle] == target) return middle;

            else if (array[middle]>target)  high = middle -1;

            else  low = middle + 1;
        }
        return -1 ;
    }
}
