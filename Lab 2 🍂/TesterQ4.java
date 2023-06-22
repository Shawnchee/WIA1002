
public class TesterQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Integer [] intArray = {5,3,7,1,4,9,8,2};
       String[] strArray = {"red", "blue", "orange", "tan"};
       
        MinMaxArray a = new MinMaxArray();
        MinMaxArray b = new MinMaxArray();
        
        System.out.println(a.minmax(intArray));
        System.out.println(b.minmax(strArray));
    }
}
