//Binary search  Tree
package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

public class BinarySearchTree {
    static Scanner scanner = new Scanner(System.in);
    
    public static Node insertToBST(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;

        }
        if (data > root.data) {
            root.right = insertToBST(root.right, data);

        } else {
            root.left = insertToBST(root.left, data);

        }

        return root;

    }

    public static Node userInput(Node root) {
        int data = scanner.nextInt();
        while (data != -1) {
            root = insertToBST(root, data);
            data = scanner.nextInt();

        }
        return root;

    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;

        }
        // LNR
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;

        }
        // NLR
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;

        }
        // LRN
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty())
            
          {
            Node temp = queue.poll();
            if (temp != null) {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    queue.add(temp.left);

                }
                if (temp.right != null) {
                    queue.add(temp.right);

                }

            } else {
                System.out.println();
                if (!queue.isEmpty()) {
                    queue.add(null);

                }

            }

        }

    }

    public static Node findMax(Node root) {
        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp;

    }

    public static Node findMin(Node root) {
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;

        }
        return temp;

    }

    public static Node deleteFromBST(Node root, int val) {
        if (root == null) {
            return root;

        }
        if (root.data == val) {
            if (root.left == null && root.right == null) {
                root = null;
                return null;

            }
            if (root.left != null && root.right == null) {
                Node temp = root.left;
                root = null;
                return temp;

            }

            if (root.left == null && root.right != null) {
                Node temp = root.right;
                root = null;
                return temp;

            }

            if (root.left != null && root.right != null) {
                int min = findMin(root.right).data;
                root.data = min;
                root = deleteFromBST(root.right, min);
                return root;

            }

        } else if (root.data > val) {
            root.left = deleteFromBST(root.left, val);
            return root;

        } else {
            root.right = deleteFromBST(root.right, val);
            return root;

        }
        
        return root;

    }

    public static void main(String[] args) {
        Node root = null;
        System.out.println("Give Data for input: ");
        root=userInput(root);

        System.out.println("Before Deletion BST is ");

        System.out.println("Inorder traversal is : ");
        inOrder(root);

        System.out.println("\nPreorder traversal is : ");
        preOrder(root);

        System.out.println("\nPostorder traversal is : ");
        postOrder(root);

        System.out.println("\nLevelorder traversal is : ");
        levelOrder(root);

        int max = findMax(root).data;
        System.out.println("\nMax value is : " + max);

        int min = findMin(root).data;
        System.out.println("\nMin value is : " + min);

        System.out.println("After Deletion BST is ");


        root=deleteFromBST(root, 55);

        System.out.println("Inorder traversal is : ");
        inOrder(root);

        System.out.println("\nPreorder traversal is : ");
        preOrder(root);

        System.out.println("\nPostorder traversal is : ");
        postOrder(root);

        System.out.println("\nLevelorder traversal is : ");
        levelOrder(root);

        int max1 = findMax(root).data;
        System.out.println("\nMax value is : " + max1);

        int min1 = findMin(root).data;
        System.out.println("\nMin value is : " + min1);

    }

}