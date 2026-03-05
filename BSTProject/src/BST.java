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
    }//end add

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
    }//end postOrder

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
    }//end inOrder

    private void inOrderHelper(TreeNode node){
        if(node != null){
            inOrderHelper(node.getLeft());
            System.out.println(node.getValue() + " ");
            inOrderHelper(node.getRight());  
        }
    }//inOrderHelper

    public void delete(Comparable value)
    {
        if(root == null)
            return;

        if(((Comparable) value).compareTo(root.getValue())==0)
        {
            if(root.getLeft() == null && root.getRight() == null)
            {
                root = null;
            }
            else if (root.getLeft() == null)
            {
                root = root.getRight();
            }
            else if (root.getRight() == null)
            {
                root = root.getLeft();
            }
            else
            {
                TreeNode temp = root.getRight();
                while(temp.getLeft() != null)
                {
                    temp = temp.getLeft();
                }
                root.setValue(temp.getValue());
                delete(temp.getValue());
            }
        }//end if
        else{
            deleteHelper(value, root);
        }//end else
    }//end delete
    
    private void deleteHelper(Comparable value, TreeNode parent)
    {
        if(parent == null)
            return;

        if(parent.getLeft() != null && ((Comparable) value).compareTo(parent.getLeft().getValue()) == 0)
        {
            TreeNode temp = parent.getLeft();
            if(parent.getLeft().getLeft() == null && parent.getLeft().getRight() == null)
            {
                parent.setLeft(null);
            
            }
            else if(temp.getLeft() == null)
            {
                parent.setLeft(temp.getRight());
            }
            else if(temp.getRight() == null)
            {
                parent.setLeft(temp.getLeft());
            }
            else
            {
                TreeNode temp2 = temp.getRight();
                while(temp2.getLeft() != null)
                {
                    temp2 = temp2.getLeft();
                }
                temp.setValue(temp2.getValue());
                deleteHelper(temp2.getValue(), temp);
            }
            }
            
            else if(parent.getRight() != null && ((Comparable) value).compareTo(parent.getRight().getValue())==0)
            {
                TreeNode temp = parent.getRight();
                if(parent.getRight().getLeft() == null && parent.getRight().getRight() == null)
                {
                    parent.setRight(null);
                }
                else if(temp.getLeft() == null)
                {
                    parent.setRight(temp.getRight());
                }
                else if(temp.getRight() == null)
                {
                    parent.setRight(temp.getLeft());
                }
                else
                {
                    TreeNode temp2 = temp.getRight();
                    while(temp2.getLeft() != null)
                    {
                        temp2 = temp2.getLeft();
                    }
                    temp.setValue(temp2.getValue());
                    deleteHelper(temp2.getValue(), temp);               
                }
            }
            else if(((Comparable) value).compareTo(parent.getValue()) < 0)
            {
                deleteHelper(value,parent.getLeft());
            }
            else
            deleteHelper(value, parent.getRight());
        }//end deleteHelper
    }//end BST
    
            
            
        
    

    

        
    
