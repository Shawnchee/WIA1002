import java.util.ArrayList;
import java.util.EmptyStackException;
class MyStack <E> {
    private ArrayList<E> stack ; 
    
    public MyStack (){
        stack = new ArrayList<>();
    }

    public void push (E element){
        stack.add(element);
    }

    public E pop(){
        if (isEmpty()) throw new EmptyStackException();
        E temp = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return temp ; 
    }

    public E peek(){
        if (isEmpty()) throw new EmptyStackException();
        return stack.get(stack.size()-1);
    }

    public int getSize(){
        return stack.size();
    }

    public boolean isEmpty(){
        if (stack.size()==0) return true;
        else return false;
    }

    public String toString(){
        return stack.toString();

    }   

    public boolean search (E element){
        for (int i = 0 ; i < stack.size() ;  i ++){
            if (stack.get(i)== element ) return true ;
        }
        return false ; 

        // or  return stack.contains(o)
    }
    }
