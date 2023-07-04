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
        TreeNode<E> current = root;
        TreeNode<E> parent;
        while (current != null){
            if (e < current.e){
                parent = current;
                current = current.left;
            }
            else if (e > current.e){
                parent = current;
                current = current.right;
            }
            else return false;      //duplicated node is not inserted
        }
        //creating a new node and attaching it to the current node;
        if (e < parent.e){
             parent.left = new TreeNode(e);
        }
        else if (e > parent.e){
            parent.right = new TreeNode(e);
        }
            size++;
            return true;
    }

    public int getSize(){
        return size;
    }

    public int height(){
        return height(root);
    }
    private int height(TreeNode<E> node){
        int height = -1;
        TreeNode<E> current = root;
        while (current!=null){
            height++;
            if (current.compareTo(node) == 0) break;

            current = node.compareTo(current) < 0 ? current.left : current.right;
        }

        return height;
    }
    public E getRoot(){
        return root.element;
    }
}

