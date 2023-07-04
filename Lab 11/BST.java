public class BST<E> extends Comparable<E> {
    TreeNode<E> root;
    int size;
    

    public boolean search (E e){
        TreeNode<E> current = root; //Start from the root
        while (current != null){
            if (e < current.e){
                current = current.left;
            }
            else if (e > current.e){
                current = current.right;
            }
            else                  //Element matches current.element             // try else if (current.e.compareTo(e) == 0) return true;
                return true;
            return false;
        }
    }

    public boolean insert (E e){
        if (root==null)
        root = new TreeNode(e);
        // code below is for finding the parent node



    }
}

