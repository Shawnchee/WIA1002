public class Q4 {
    public static void main(String[] args) {
        //(10,34,2,56,7,67,88,42)
        int [] arr = {10,34,2,56,7,67,88,42};

        insertionSort(arr);
        System.out.print("After sorting: ");
        for (int i : arr){
            System.out.print(i + " ");
        }
        
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1 ; i < arr.length; i ++){
            int min = arr[i];
            int k = i -1;
            while ( k >= 0 && arr[k] > min ){
                arr[i]  = arr[k];                           // or arr[k+1] = arr[k];
                k--;                                        // k++ only
                i--;
            }
            arr[k+1] = min ;
            }
        }

    }

 // or this one using for loop
// public static void insertionSort(int[] arr) {
//         for (int i = 1 ; i < arr.length; i ++){
//             int min = arr[i];
//             int k ;
//             for ( k = i -1 ; k >=0 && arr[k] > min ; k--){
//             arr[i] = arr[k];
//             i--;
//             } 
//             arr[k+1] = min;
//      }
//  }
// }

    