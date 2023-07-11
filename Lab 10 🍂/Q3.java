public class Q3 {
    public static void main(String[] args) {
        int [] arr = {45, 7, 2, 8, 19, 3};

        System.out.print("Before sorting: ");
        for (int j : arr){
            System.out.print(j + " ");
        }

        Q1.selectionSortSmallest(arr);
        System.out.print("\nAfter sorting in ascending order: ");
        for (int i : arr){
            System.out.print(i + " ");
        }

        Q2.selectionSortLargest(arr);
        System.out.print("\nAfter sorting in descending order: ");
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}

