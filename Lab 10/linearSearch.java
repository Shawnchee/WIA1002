public class linearSearch {
    public static void main(String[] args) {
        int [] array = {2,3,6,7,1,5,9,8};
        int target = 9;
        int result = LinearSearch(array, target);
        System.out.println(target+" is found at index: " + result);
    }

    public static int LinearSearch(int [] array, int target){
        for (int i = 0 ; i < array.length ; i ++){
            if (target == array[i]) return i;
        }
        return -1;
    }
}
