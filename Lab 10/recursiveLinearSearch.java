public class recursiveLinearSearch {
    public static void main(String[] args) {
        int [] array = {2,3,6,7,1,5,9,8};
        int target = 1;
        int result = RecursiveLinearSearch(array,array.length, target);
        if (result != -1)
        System.out.println(target+" is found at index: " + result);
        else
        System.out.println(target + " is not found.");
    }

    public static int RecursiveLinearSearch(int [] array,int size, int target){
        if (size == 0) return -1;

        else if (array[size-1] == target) return size-1;

        else {
            return RecursiveLinearSearch(array, size-1, target);
        }
    }
}