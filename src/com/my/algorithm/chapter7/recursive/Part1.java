package com.my.algorithm.chapter7.recursive;

/**
  재귀함수
 1~10 출력
 * */
public class Part1 {

  public static void recursive(int n){
//    System.out.print(n + " "); // 10 9 8 7 6 5 4 3 2 1 0
    if(n <= 0) return;
    else recursive(n-1);
    System.out.print(n + " "); // 0 1 2 3 4 5 6 7 8 9 10

  }

  public static void main(String[] args) {
    recursive(10);
  }

}
