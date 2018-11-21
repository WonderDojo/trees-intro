package com.wonderdojo;

public class Fibbonaci {

  static int fib(int x) {
    if (x < 2) {
      return 1;
    }
    return fib(x - 1) + fib(x - 2);
  }

  static void fibnumbers(int n) {
    for (int i = 0; i <= n; i++) {
      System.out.println("[" + i + "]" + fib(i));
    }
  }


  public static void main(String[] args) {
    Fibbonaci.fibnumbers(6);
    System.out.println(Fibbonaci.fib(6));
  }
}
