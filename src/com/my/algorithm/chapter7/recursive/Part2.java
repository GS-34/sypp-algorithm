package com.my.algorithm.chapter7.recursive;

import java.util.Scanner;

/**
  재귀함수2
 10진수 N 을 받아
 이진수로 변환 후 출력하는 프로그램을 만들어라,
 재귀함수 이용
 * */
public class Part2 {

  public static void recursive(int n){
    if(n == 0) return;

    recursive(n / 2);
    System.out.print(n % 2);
  }

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    recursive(n);

  }

}
