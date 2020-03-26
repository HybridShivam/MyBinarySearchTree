/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package tree;
import node.TreeNode;

public class MyBinarySearchTree {
    private TreeNode root;

    public MyBinarySearchTree(){
        root=null;
    }

    public TreeNode getRoot() {
        return root;
    }


    public void insert(int data){
        root=insertRecursive(root,data);
    }

    TreeNode insertRecursive(TreeNode root,int data){
        if(root==null){
            root=new TreeNode(data);
            return root;
        }
        else{
            if(root.getData()>=data){
                root.setLeft(insertRecursive(root.getLeft(),data));
            }
            else if(root.getData()<data){
                root.setRight(insertRecursive(root.getRight(),data));
            }
            return root;
        }
    }


    public void traverseInOrder()  {
        traverseInOrderRec(root);
    }

    // A recursive function to do inorder traversal of BST
    void traverseInOrderRec(TreeNode root) {
        if (root != null) {
            traverseInOrderRec(root.getLeft());
            System.out.println(root.getData());
            traverseInOrderRec(root.getRight());
        }
    }

    public void traversePreOrder()  {
        traversePreOrderRec(root);
    }

    // A recursive function to do preorder traversal of BST
    void traversePreOrderRec(TreeNode root) {
        if (root != null) {
            System.out.println(root.getData());
            traversePreOrderRec(root.getLeft());
            traversePreOrderRec(root.getRight());
        }
    }

    public void traversePostOrder()  {
        traversePostOrderRec(root);
    }

    // A recursive function to do preorder traversal of BST
    void traversePostOrderRec(TreeNode root) {
        if (root != null) {
            traversePostOrderRec(root.getLeft());
            traversePostOrderRec(root.getRight());
            System.out.println(root.getData());
        }
    }

    public boolean search(int data){
        TreeNode node=searchRec(root,data);
        if(node==null){
            return false;
        }
        else if(node.getData()==data){
            return true;
        }
        else {
            return false;
        }
    }
    public TreeNode searchRec(TreeNode root, int data)
    {
        // Base Cases: root is null or key is present at root
        if (root==null || root.getData()==data)
            return root;

        // val is greater than root's key
        if (root.getData() > data)
            return searchRec(root.getLeft(), data);

        // val is less than root's key
        return searchRec(root.getRight(), data);
    }

    public int count(){
        return countRec(root);
    }

    // A recursive function to count total no of nodes of BST
    public int countRec(TreeNode root) {
        if (root == null)
            return 0;
        int count = 0;
        count++;
        count += (countRec(root.getLeft()) + countRec(root.getRight()));
        return count;
    }
}
