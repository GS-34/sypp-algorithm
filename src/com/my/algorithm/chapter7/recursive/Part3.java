package com.my.algorithm.chapter7.recursive;

import java.util.Scanner;

/**
  팩토리얼
 자연수 N 이 입력되면 N! 을 출력하는 프로그램 (재귀함수)
 예를들어 5! = 5*4*3*2*1 = 120
 * */
public class Part3 {

  public static int recursive(int n){
    if(n <= 1) return n;
    return n * recursive(n-1);
  }

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();

    System.out.println(recursive(n));

  }

}
