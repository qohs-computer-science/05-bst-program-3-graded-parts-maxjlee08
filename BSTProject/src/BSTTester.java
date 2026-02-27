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

    tree.preOrder();
    tree.postOrder();
    tree.inOrder();


	
 }
}