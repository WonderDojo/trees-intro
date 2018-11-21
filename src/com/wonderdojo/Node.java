package com.wonderdojo;

public class Node {

  int value;
  Node left;
  Node right;

  Node(int n) {
    value = n;
  }

  void add(int n) {
    if (n <= value) {
      if (left == null) {
        left = new Node(n);
      } else {
        left.add(n);
      }
    } else {
      if (right == null) {
        right = new Node(n);
      } else {
        right.add(n);
      }
    }
  }

  boolean find(int n) {
    if (value == n) {
      return true;
    }
    if (value > n && left != null) {
      return left.find(n);
    }
    if (value < n && right != null) {
      return right.find(n);
    }
    return false;
  }
}
