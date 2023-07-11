import java.util.LinkedList;

public class MyQueue<E> {
    LinkedList <E> queue = new LinkedList<>();

    public MyQueue(){
    }

    public MyQueue(E[] e){
        for (E element : e){
            enqueue(element);
        }
    }

    public void enqueue (E e){
        queue.addLast(e);
    }
    public E dequeue(){
        E top = queue.removeFirst();
        return top;
    }

    public E getElement(int i){
       return queue.get(i);
        
    }

    public E peek(){
        return queue.peek();
    }

    public int getSize(){
        return queue.size();
    }

    public boolean contains (E e){
        return queue.contains(e);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public String toString(){
        return queue.toString();
    }

    public void updateFirst(E e){
        queue.removeFirst();
        queue.addFirst(e);
    }

}