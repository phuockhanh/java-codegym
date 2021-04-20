public class BTS<E extends Comparable<E>> extends AbstractTree<E>{
    public TreeNode<E> root;
    public int size =0;
    public BTS(){

    }
    public BTS(E[] objects){
        for(int i=0;i<size;i++){
            insert(objects[i]);
        }
    }
    @Override
    public boolean insert(E e){
        if(root==null){
            root = createNewNode(e);
        }
        else{
            TreeNode<E> parent = null;
            TreeNode<E> curent = root;
            while (curent!=null){
                if(e.compareTo(curent.element)<0){
                    parent = curent;
                    curent = curent.left;
                }
                else if(e.compareTo(curent.element)>0){
                    parent = curent;
                    curent = curent.right;
                }
                else{
                    return false;
                }
            }
            if(e.compareTo(parent.element)<0){
                parent.left = createNewNode(e);
            }
            else{
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }
    public TreeNode<E> createNewNode(E e){
        return new TreeNode<>(e);
    }
    @Override
    public void innorder() {
        innorder(root);
    }
    public void innorder(TreeNode<E> root){
        if (root == null) return;
        innorder(root.left);
        System.out.println(root.element + " ");
        innorder(root.right);
    }
    @Override
    public int size(){
        return size;
    }
}
