import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string: ");
        String line = sc.nextLine();
        System.out.println(line + " ---> " + substituteAI(line,0));

    }

    public static String substituteAI(String line, int index){
        if (index == line.length()){
            return line;
        }
        if(line.charAt(index)  == 'a')
        line = line.substring(0, index) + 'i' + line.substring(index+1);

        return substituteAI(line,index+1);



    }
}
