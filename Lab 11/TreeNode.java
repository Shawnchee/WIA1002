public class TreeNode<E extends Comparable<E>>{
    E element;
    TreeNode<E> left;
    TreeNode<E> right;
    
    public TreeNode (E element){
        this.element = element;
    }
}