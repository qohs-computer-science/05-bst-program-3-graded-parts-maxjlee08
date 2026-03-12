/*
 * Max Lee
 * 2/25/26
 * 4
 * Binary Search Tree and using different methods and traversals to print the tree.
 */

 import java.lang.Comparable;

 public class BSTTester {
   public static void main(String[] args) {
    BST tree = new BST();

    String[] values = {"O", "R", "C", "H", "A", "R", "D", "Q", "U", "I", "N", "C", "E"};

    for (String value : values) {
      tree.add(value);
    }

    //Traversals
    tree.preOrder();
    tree.postOrder();
    tree.inOrder();

    //Size
    System.out.println("Size: " + tree.size());

    //isEmpty
    System.out.println("Is the tree empty? " + tree.isEmpty());

    //delete
    System.out.println("Delete Q: " + tree.delete("Q"));
    tree.inOrder();

    System.out.println("Delete O: " + tree.delete("O"));
    tree.inOrder();

    System.out.println("Delete Z (not in tree): " + tree.delete("Z"));
    tree.inOrder();

    //find
    System.out.println("Find H: " + tree.find("H"));
    tree.inOrder();

    System.out.println("Find Z: " + tree.find("Z"));
    tree.inOrder();

    //replace
    System.out.println("Replace R with S: " + tree.replace("R", "S"));
    tree.inOrder();

    System.out.println("Replace Z with Y (Z not in tree): " + tree.replace("Z", "Y"));
    tree.inOrder();




    

    



    

	
 }
}