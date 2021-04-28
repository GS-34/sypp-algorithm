package com.my.algorithm.chapter7.recursive;

import java.util.Scanner;

/**
  피보나치 수열(재귀함수)
 1 1 2 3 5 8
 * */
public class Part4 {

  static int[] fibo;

  public static int recursive(int n){
    if(fibo[n] > 0) return fibo[n];
    if(n == 1 || n == 2) return fibo[n] = 1;
    return fibo[n] = recursive(n-2) + recursive(n-1);
  }

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();

    fibo = new int[n+1];

    recursive(n);

    for (int i = 1; i < fibo.length; i++) System.out.print(fibo[i] + " ");




  }

}
