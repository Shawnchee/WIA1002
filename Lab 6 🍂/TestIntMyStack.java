import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {
        MyStack <Integer> stack = new MyStack<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        int value = sc.nextInt();
        for (int i = 1 ; i <= value ; i ++){
            stack.push(i);
        }
        System.out.println("Size of stack: " + stack.getSize());

        System.out.println("Popping starts now...");
        for (int i = value; i>= 1 ; i --){
            stack.pop();
            System.out.println(stack.toString());
        }
        sc.close();
    }
}
