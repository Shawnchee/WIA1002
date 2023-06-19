import java.util.Random;
import java.util.Stack;
public class SumOfStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Random random = new Random();
        int number = random.nextInt(10)+1;
        System.out.println("The number of elements in the stack are: " + number);
        System.out.print("The list of positive numbers in the stack are: ");
        for (int i = 0 ; i < number ; i ++){
            int value = random.nextInt(101);
            System.out.print(value + " ");
            stack.push(value);
        }
        System.out.println("");
        System.out.println(stack);
        System.out.println("Sum of elements in stack is: " + sum(stack));

    }

    public static int sum (Stack<Integer> stack){
        int sum = 0 ; 
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }

    
}
