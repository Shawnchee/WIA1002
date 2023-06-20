public class Tester {
    public static void main(String[] args) {
                MyQueue <String> fruitQ = new MyQueue<>();
                fruitQ.enqueue("Durian");
                fruitQ.enqueue("Blueberry");
                fruitQ.enqueue("Apple");
                fruitQ.enqueue("Oranges");
                fruitQ.enqueue("Grapes");
                fruitQ.enqueue("Cherry");
                System.out.println(fruitQ.toString());
                System.out.println(fruitQ.peek());
                System.out.println(fruitQ.getSize());
                fruitQ.dequeue();
                System.out.println(fruitQ.getElement(2));
                System.out.println(fruitQ.contains("Cherry"));
                System.out.println(fruitQ.contains("Durian"));

                while(!fruitQ.isEmpty()){
                    System.out.print(fruitQ.dequeue()+ " ");
                }



    }
}
