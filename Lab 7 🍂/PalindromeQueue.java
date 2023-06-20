import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeQueue {
    public static void main(String[] args) {
        Queue <Character>queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to check: ");
        String input = sc.nextLine();
        String reversed = "";
        for (int i = input.length()-1; i >=0 ; i --){
            queue.add(input.charAt(i));
        }

        for (int i = 0 ; i < input.length(); i ++){
            reversed += queue.remove();
        }
        
        if (input.equals(reversed)) System.out.println("The string is palindrome");
        else System.out.println("The string is not a palindrome");
        sc.close();
    }
    }

