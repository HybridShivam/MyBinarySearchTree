/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package main;
import tree.MyBinarySearchTree;
// executable class

public class Main {
    public static void main(String[] args) {
        MyBinarySearchTree mytree=new MyBinarySearchTree();
        mytree.insert(50);
        mytree.insert(30);
        mytree.insert(20);
        mytree.insert(40);
        mytree.insert(70);
        mytree.insert(60);
        mytree.insert(80);
//        int elementToSearch=89;
//        System.out.println(elementToSearch +" present ? : "+mytree.search(elementToSearch));
//        elementToSearch=60;
//        System.out.println(elementToSearch +" present ? : "+mytree.search(elementToSearch));
//        System.out.println("In Order Traversal of tree :");
//        mytree.traverseInOrder();
//        System.out.println("Pre Order Traversal of tree :");
//        mytree.traversePreOrder();
//        System.out.println("Post Order Traversal of tree :");
//        mytree.traversePostOrder();
//        System.out.println("Total no of nodes : "+mytree.count());
    }
}


