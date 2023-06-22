
public class CompareMax {
    public static <E extends Comparable> void maximum (E e1, E e2, E e3){
        if ((e1.compareTo(e3) > 0 && e1.compareTo(e2)> 0)){
            System.out.println("The maximum is " + e1);
        }
        else if ((e2.compareTo(e3) > 0 && e2.compareTo(e1)> 0)){
            System.out.println("The maximum is " + e2);
        }
        else {
            System.out.println("The maximum is " + e3);
        }
    }
    public static void main(String[] args) {
        CompareMax.<Integer>maximum(2,4,3);         // also can use this to invoke a method
        maximum(2,4,3);                                               // or thisd
        maximum ("red", "blue", "green");
        maximum(3.3,351.2,213.2);
        
    }
}
