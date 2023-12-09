import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {
    }

    private Node root;
    
    public void insert(Scanner scanner){

        System.out.println("Enter the root Node : ");
        int value = scanner.nextInt();
        root = new Node(value);
        insert(scanner,root);


    }

    public void insert (Scanner scanner,Node node){
        System.out.println("Do you want to enter the left "+node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of "+node.value);
            int value = scanner.nextInt();
            node.left=new Node(value);
            insert(scanner,node.left);
        }

        System.out.println("Do you want to enter the right of "+node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the vlaue of the right of "+node.value);
            int value = scanner.nextInt();
            node.right=new Node(value);
            insert(scanner, node.right);
        }
    }


    public void display(){
        display(root," ");
    }

    private void display(Node node,String indent){
        if (node==null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    private class Node{
        private int value;
        private Node left;
        private Node right;


        public Node(int value) {
            this.value = value;
        } 
    }
}
