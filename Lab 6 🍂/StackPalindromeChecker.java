import java.util.Scanner;
import java.util.Stack;

public class StackPalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String string = sc.nextLine();
        if (string.length() >15) System.out.println("String has exceeded length.");
        else{
        System.out.println("Is the string a palindrome?: " + palindromeCheck(string));
        sc.close();
        }
    
}
    public static boolean palindromeCheck(String string){
        Stack <Character> stack = new Stack<>();
        String reversed = "";
        for (int i = 0 ; i < string.length(); i ++){
            stack.push(string.charAt(i));
        }
   

        for (int i = string.length(); i >0 ; i --){
            reversed += stack.pop();
        }

        if (string.equals(reversed)) return true;
        else return false;
    }
}
