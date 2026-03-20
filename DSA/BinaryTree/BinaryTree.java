//Binary Tree
package BinaryTree;

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

public class BinaryTree {
    static Scanner scanner = new Scanner(System.in);


    public static Node createTree() {
        System.out.println("Enter the data: ");
        int data = scanner.nextInt();

        if (data == -1) {
            return null;

        }
        Node root = new Node(data);
        System.out.println("Enter data for the left Side of the tree: ");
        root.left = createTree();

        System.out.println("Enter data for the right Side of the tree: ");
        root.right = createTree();

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

        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node temp=queue.poll();
            if (temp!=null) {
                System.out.print(temp.data+" ");
                if (temp.left!=null) {
                    queue.add(temp.left);
                    
                }
                if (temp.right!=null) {
                    queue.add(temp.right);
                    
                }
                
            }else{
                System.out.println();
                if (!queue.isEmpty()) {
                    queue.add(null);
                }

            }
            
        }


    }

    public static int findMax(Node root){
        if (root==null) {
            return Integer.MIN_VALUE;
        }

        int leftMax=findMax(root.left);
        int rightMax=findMax(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static int findMin(Node root){
        if (root==null) {
            return Integer.MAX_VALUE;
            
        }
        int leftMin=findMin(root.left);
        int rightMin=findMin(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public static boolean search(Node root,int key){
        if (root==null) {
            return false;
            
        }
        if (root.data==key) {
            return true;
            
        }
        boolean foundLeft=search(root.left, key);
        boolean foundRight=search(root.right, key);
        return foundLeft || foundRight; 
    }

    public static int sumOfLeafNodes(Node root){
        if (root==null) {
            return 0;
            
        }
        if (root.left==null && root.right==null) {
            return root.data;
            
        }
        return sumOfLeafNodes(root.left)+sumOfLeafNodes(root.right);

    }

    public static void main(String[] args) {
        // Node root=createTree();

        Node root=new Node(10);
        root.left=new Node(20);
        root.left.left=new Node(40);
        root.left.left.left=new Node(20);
        root.left.right=new Node(50);
        root.left.right.right=new Node(55);
        root.left.left.right=new Node(25);
        root.right=new Node(30);
        root.right.left=new Node(60);



        System.out.println("Inorder traversal is : ");
        inOrder(root);

        System.out.println("\nPreorder traversal is : ");
        preOrder(root);

        System.out.println("\nPostorder traversal is : ");
        postOrder(root);

        System.out.println("\nLevelorder traversal is : ");
        levelOrder(root);

        int max=findMax(root);
        System.out.println("\nMax value is : "+ max);

        int min=findMin(root);
        System.out.println("\nMin value is : "+ min);

        System.out.println("Enter the Value to Search: ");
        int key=scanner.nextInt();
        boolean found=search(root, key);
        if (found) {
            System.out.println(key+ " is Present");
            
        }else{
             System.out.println(key+ " is not Present");
        }

        int sumOfLeafNodes=sumOfLeafNodes(root);
        System.out.println("Sum of leaf nodes : "+ sumOfLeafNodes);


    }




}