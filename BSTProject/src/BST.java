import java.lang.Comparable;

public class BST implements BSTInterface
{
    private TreeNode root;
    private int size;

    //constructor
    public BST()
    {
        root = null;
        size = 0;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    //Add
    public void add(Comparable newVal)
    {
        if(root == null)
        {
            root = new TreeNode(newVal);
        }
        else
        {
            addHelper(newVal, root);
        }    
        size++;
    }

    //AddHelper
    private void addHelper(Comparable value, TreeNode subroot)
    {
        if(value.compareTo(subroot.getValue()) <= 0)
        {
            if(subroot.getLeft() == null)
            {
                subroot.setLeft(new TreeNode(value));
            }
            else
            {
                addHelper(value, subroot.getLeft());
            }
        }
        else
        {
            if(subroot.getRight() == null)
            {
                subroot.setRight(new TreeNode(value));
            }
            else
            {
                addHelper(value, subroot.getRight());
            }
        }
    }//end addHelper

    //Pre-Order
    public void preOrder(){
        System.out.println("Pre-Order:");
        System.out.println(root.getValue() + " ");
        preOrderHelper(root.getLeft());
        preOrderHelper(root.getRight());  
    }

    private void preOrderHelper(TreeNode node){
        if(node != null){
            System.out.println(node.getValue() + " ");
            preOrderHelper(node.getLeft());
            preOrderHelper(node.getRight());  
        }
    }//end preOrder

    //Post Order
    public void postOrder(){
        System.out.println("Post-Order:");
        postOrderHelper(root.getLeft());
        postOrderHelper(root.getRight());  
        System.out.println(root.getValue() + " ");
        System.out.println();
    }

    private void postOrderHelper(TreeNode node){
        if(node != null){
            postOrderHelper(node.getLeft());
            postOrderHelper(node.getRight());  
            System.out.println(node.getValue() + " ");
        }
    }//end postOrder

    //In-Order
    public void inOrder(){
        System.out.println("In-Order:");
        inOrderHelper(root.getLeft());
        System.out.println(root.getValue() + " ");
        inOrderHelper(root.getRight());  
    }

    private void inOrderHelper(TreeNode node){
        if(node != null){
            inOrderHelper(node.getLeft());
            System.out.println(node.getValue() + " ");
            inOrderHelper(node.getRight());  
        }
    }
}