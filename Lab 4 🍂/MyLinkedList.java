
import java.util.NoSuchElementException;
public class MyLinkedList<E> {
    private Node<E> next;
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public MyLinkedList() {

    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        head = newNode;
        size++;

        if (tail == null) {
            tail = newNode;
        }

    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (tail == null && head == null) {
            head =  tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        } else if (index == size) {
            addLast(e);
        } else {
            Node<E> newNode = new Node<>(e);

            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;

            size++;
        }
    }

    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            size--;
            return temp.element;
        }
    }

    public E removeLast() {
        if (size == 0) {
            return null;
        } else if (size == 1) {
            Node<E> temp = new Node<>();
            temp = head;
            head = tail = null;
            size = 0;
            return temp.element;

        } else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }

            Node<E> temp = current.next;   // or tail
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = temp.next;
            size--;
            return temp.element;
        }
    }

    public boolean contains(E e) {
        if (tail == null) {
            head = tail = null;
            return false;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size; i++) {
                if (current.element.equals(e)) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    public E get(int index) {
        if (index == 0) {
            return getFirst();
        } else if (index >= size) {
            return null;
        } else {
            Node<E> current = new Node<>();
            current = head ;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.element;
        }
    }

    public E getFirst() {
        if (size == 0) {
            return null;
        } else {
            return head.element;
        }
    }

    public E getLast() {
        if (size == 0) {
            return null;
        } else {
            Node<E> current = new Node<>();
            current = head;
            for (int i = 0; i < size - 1; i++) {
                current = current.next;     // at the tail now
            }
            return current.element;
        }
    }

    public int indexOf(E e) {
        if (contains(e)) {
            Node<E> current = new Node<>();
            current = head;
            for (int i = 0; i < size - 1; i++) {
                if (current.element.equals(e)) {
                    return i;
                }
                current = current.next;
            }
        }
        return -1;
    }

    public int lastIndexOf(E e) {
        Node<E> current = head;
        int count = 0;
        int index = -1;

        for (int i = 0; i < size - 1; i++) {
            if (current.element.equals(e)) {
                index = count;
            }
            current = current.next;
            count++;
        }
        return index;
    }

    public E set(int index, E e) {
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;        // pointing to the index 
            // to be removed
        }
        Node<E> temp = new Node<>();
        temp = current;
        current.element = e;
        return temp.element;               // return element that was replaced
    }

    public void clear() {
        Node<E> temp = new Node<>();
        while (head != null){
            temp = head.next; 
            head.next = null ;
            head = temp ;
        }
        head= tail = null ; 
        this.size = 0;
    }

    public void print() {
        if (head == null && tail == null) {
            System.out.println("[ ]");
        }
        Node<E> current = head;
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.println(current.element+ "]");
            }
            else 
                System.out.print(current.element + ",");
            current = current.next;
        }
    }

    public void reverse() {
        if (head == null && tail == null) {
            System.out.println("[ ]");
        } else {
            String s = head.element + "";
            for (Node<E> node = head.next; node != null; node = node.next) {
                s = node.element + "," + s;
            }
            System.out.printf("[%s]\n", s);
        }
    }
    
    public int getSize(){
        return this.size;
    }
    
    public E getMiddleValue(){
        int tempSize = this.size -1 ; 
        Node<E> middle = new Node<>();
        int middlePoint =0 ; 
        if (tempSize % 2 == 0){
            middlePoint = this.size/2 ; 
            return get (middlePoint);
        }
        else {
            middlePoint = (this.size+1)/2;
            return get(middlePoint);
        }
    }
}
