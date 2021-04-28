package com.my.algorithm.chapter7.recursive;

import java.util.Scanner;

/**
  피보나치 수열(재귀함수)
 1 1 2 3 5 8
 * */
public class Part4 {

  public static int recursive(int n){
    if(n == 1 || n == 2) return 1;
    return recursive(n-2) + recursive(n-1);
  }

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();

    for(int i = 1; i <= n; i++){
      System.out.print(recursive(i) + " ");
    }


  }

}
