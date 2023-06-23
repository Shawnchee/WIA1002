public class recursiveBinarySearch {
    public static void main(String[] args) {
        int [] array = {2,3,6,7,1,5,9,8};
        int target = 11;
        int low = 0 , high = array.length-1; 
        int result = RecursiveBinarySearch(array, low,high,target);
        if (result != -1)
        System.out.println(target+" is found at index: " + result);
        else
        System.out.println(target + " is not found.");
        
    }

    public static int RecursiveBinarySearch(int[] array, int low, int high ,int target) {
        int middle = (low + high) /2;

        if(high >= low){

        if (array[middle] == target) return middle;
        
        else if (array[middle] > target) return RecursiveBinarySearch(array, low, middle-1, target);

        else return RecursiveBinarySearch(array, middle + 1, high, target);

        }
        return -1;
    }
        
    }


