package BinaryTree.Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    public int data;
    public Node left;
    public Node right;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {

    static Scanner scanner = new Scanner(System.in);

    public static Node createTree(){
        System.out.println("Please Create You Tree: ");
        int data = scanner.nextInt();
        if(data == -1){
            return null;
        }
        Node root = new Node(data);

        System.out.println("Enter the left side Node");
        root.left = createTree();

        System.out.println("Enter the right side Node");
        root.right = createTree();

        return root;
    }
    
    public static void InOrderTree(Node root){
        if(root == null){
            return;
        }
        
        // LNR 
        InOrderTree(root.left);
        System.out.println(root.data+" ");
        InOrderTree(root.right);
    }

    public static void preOrderTree(Node root){
        if(root == null){
            return;
        }
        //NLR
        System.out.println(root.data+" ");
        preOrderTree(root.left);
        preOrderTree(root.right);
    }

    public static void postOrderTree(Node root){
        if(root == null){
            return;
        }
        // LRN 
        postOrderTree(root.left);
        postOrderTree(root.right);
        System.out.println(root.data+" ");
    }
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp != null){
                System.out.print(temp.data+" ");
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right == null){
                    queue.add(temp.right);
                }
            }else{
                System.out.println();
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            
            }
        }
        System.out.println();
    }

    public static int findMax(Node root){
        if(root == null){
            return -1;
        }
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }
    
    public static int findMin(Node root){
        if(root == null){
            return 0;
        }
        int leftMin = findMin(root.left);
        int rightMin = findMin(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        
        boolean leftSearch = search(root.left, key);
        boolean rightSearch = search(root.right, key);

        return leftSearch || rightSearch;

    }

    public static int leafOfNode(Node root){
        if(root==null){
            return 0;
        }
        if(root.left == null && root.left == null){
            return root.data;
        }
       return leafOfNode(root.left)+leafOfNode(root.right);
        
    }

    public static void main(String[] args) {

        Node root = createTree();


        System.out.println("the inOrder tree is ");
        InOrderTree(root);

        System.out.println("the preOrder tree is ");
        preOrderTree(root);

        System.out.println("the post order tree is ");
        postOrderTree(root);

        System.out.println("the Lever Order tree is ");
        levelOrder(root);

        System.out.println("Max Number in tree");
        findMax(root);

        System.out.println("The minmum tree is ");
        findMin(root);

        System.out.println("The Leaf Node is ");
        leafOfNode(root);

        System.out.println("The tree search is 20");
        search(root, 20);


        
    }
    
}
