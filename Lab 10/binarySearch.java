public class binarySearch {
    public static void main(String[] args) {
        int [] array = {2,3,6,7,1,5,9,8};
        int target = 9;
        int result = BinarySearch(array, target);
        if (result != -1)
        System.out.println(target+" is found at index: " + result);
        else
        System.out.println(target + " is not found.");

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
