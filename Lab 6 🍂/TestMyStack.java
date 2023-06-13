
public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack.toString());
        System.out.println("Does the stack contain 'b'?: " + stack.search('b'));
        System.out.println("Does the stack contain 'k'?: " + stack.search('k'));
        System.out.println("+------------------------------------------+");
        MyStack<Integer> stack2 = new MyStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack2.toString());
        System.out.println("Does the stack contain '6': " + stack2.search(6));

    }
}
