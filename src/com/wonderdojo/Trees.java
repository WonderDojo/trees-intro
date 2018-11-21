package com.wonderdojo;

public class Trees {


  private static void inOrder(Node n) {
    if (n.left != null) {
      inOrder(n.left);
    }
    System.out.println(n.value);
    if (n.right != null) {
      inOrder(n.right);
    }
  }

  private static void preOrder(Node n) {
    System.out.println(n.value);
    if (n.left != null) {
      preOrder(n.left);
    }
    if (n.right != null) {
      preOrder(n.right);
    }
  }

  private static void postOrder(Node n) {
    if (n.left != null) {
      postOrder(n.left);
    }
    if (n.right != null) {
      postOrder(n.right);
    }
    System.out.println(n.value);
  }


  static Node getBinaryTree() {
    Node root = new Node(15);
    root.left = new Node(14);
    root.left.left = new Node(-3);
    root.left.right = new Node(1);
    root.right = new Node(100);
    root.right.left = new Node(8);
    root.right.left.left = new Node(4);
    root.right.left.left.left = new Node(2);
    root.right.left.right = new Node(10);
    return root;
  }

  static Node getSortedBinaryTree() {
    Node root = new Node(15);
    root.add(14);
    root.add(-3);
    root.add(1);
    root.add(100);
    root.add(8);
    root.add(4);
    root.add(2);
    root.add(10);
    return root;
  }

  public static void main(String[] args) {
    Node root = getSortedBinaryTree();
    //Node root = getBinaryTree();

    System.out.println("In Order");
    inOrder(root);

    System.out.println("\nPre Order");
    preOrder(root);

    System.out.println("\nPost Order");
    postOrder(root);

    System.out.println("Fond 2 ? " + root.find(2));
    System.out.println("Fond 22 ? " + root.find(22));
  }

}
