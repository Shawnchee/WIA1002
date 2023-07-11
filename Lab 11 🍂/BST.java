import java.util.ArrayList;

public class BST<E extends Comparable<E>> {
    TreeNode<E> root;
    int size;
    

    public boolean search (E e){
        TreeNode<E> current = root; //Start from the root
        while (current != null){
            if (e.compareTo(current.element)<0){
                current = current.left;
            }
            else if (e.compareTo(current.element)>0){
                current = current.right;
            }
            else                  //Element matches current.element             // try else if (current.e.compareTo(e) == 0) return true;
                return true;
        }
                return false;
    }

    public boolean insert (E e){
       if (root == null) root = new TreeNode<E>(e);

       else {
        TreeNode<E> parent = root;
        int value = 0 ;

        for (TreeNode<E> current = root ; current != null;){
            value = e.compareTo(current.element);
            if (value ==0){
                return false;
            }
            parent = current;
            current = value < 0 ? current.left : current.right;

        }
        if (value < 0 ){
            parent.left = new TreeNode<E>(e);
        }
        else {
            parent.right = new TreeNode<E>(e);
        }
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
            if (current.element.compareTo(node.element) == 0) break;

            current = node.element.compareTo(current.element) < 0 ? current.left : current.right;
        }

        return height;
    }
    public E getRoot(){
       return root.element;
    }

     public E minValue(){
        TreeNode<E> current = root;
        while (current.left!= null) {
            current = current.left;
        }
        return current.element;
     }

      public E maxValue(){
          TreeNode<E> current = root;
        while (current.right!= null) {
            current = current.right;
        }
        return current.element;
      }

      public java.util.ArrayList<TreeNode<E>> path(E e){
        if (root == null) return null;

        ArrayList<TreeNode<E>> path = new ArrayList<>();

        for (TreeNode<E> current = root; current!= null ;){
            path.add(current);
            if (current.element.compareTo(e) == 0) break;
            current = e.compareTo(current.element) < 0 ? current.left : current.right;
        }

        return path;
    }

    public boolean delete(E e){
        // Find node and parent
        TreeNode<E> parent = null;
        TreeNode<E> current = root; 

        while(current!= null){
            if(current.element.compareTo(e)==0) break;
            parent = current;
            current = e.compareTo(current.element)<0 ? current.left : current.right;
        }

        //No node at all
        if (current == null)  return false;
        if (current.left == null){
            if (parent== null) root = current.right;

            else if (parent.left.element.compareTo(current.element)==0) parent.left = current.right;

            else parent.right = current.right;
        }

        else {
            TreeNode<E> parentRightMost = current;
            TreeNode<E> rightMost = current.left;
            	while (rightMost.right != null) {
				parentRightMost = rightMost;
				rightMost = current.right;
			}

			// Replace the right most node with node
			current.element = rightMost.element;

			if (parentRightMost.right.element.compareTo(rightMost.element) == 0)
				parentRightMost.right = rightMost.left;
			else
				// Special case: parentRightMost == node
				// Not always the rightMost is on the right
				parentRightMost.left = rightMost.left;
		}
		
		size--;
		return true;
	}

    public boolean clear(){
        if (root == null && size ==0)
            return false;

        root = null; 
        size = 0 ; 
        return false;
    }


    public void inOrder(){
        inOrder(root);
    }
    protected void inOrder(TreeNode<E> root){
        if (root!=null){
            inOrder(root.left);
            System.out.print(root.element + " ");
            inOrder(root.right);
        }
    }
    
	public void preOrder() {
		preOrder(root);
	}
	
	public void preOrder(TreeNode<E> node) {
		if(node != null) {
			System.out.print(node.element + " ");
			inOrder(node.left);
			inOrder(node.right);
		}
	}
	
	public void postOrder() {
		postOrder(root);
	}
	
	public void postOrder(TreeNode<E> node) {
		if(node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.element + " ");
		}
	}
	
}






