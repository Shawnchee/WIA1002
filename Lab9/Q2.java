import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Input String: ");
        String line = sc.nextLine();
        permuteString(line,"");
    }


    public static void permuteString(String characters, String ans){
        if (characters.length()==0)
        System.out.println(ans + "");

        for (int i =0 ; i < characters.length(); i ++){
            char ch = characters.charAt(i);
            
            String string = characters.substring(0, i) + characters.substring(i+1);

            permuteString(string, ans + ch);
        }



    }
}
