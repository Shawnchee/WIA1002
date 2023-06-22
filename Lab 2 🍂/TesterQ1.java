
public class TesterQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        MyGeneric strObj = new MyGeneric ("Shawn Chee");
        MyGeneric intObj = new MyGeneric (30);
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}
