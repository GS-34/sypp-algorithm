package com.my.algorithm.chapter8.dfsbfs;

import java.util.Scanner;

/**
 4. 중복순열 구하기
 1부터 N 까지 번호가 적힌 구슬이 있습니다.
 이 중 중복을 허용하여 M번을 뽑아 일렬로 나열하는 방법을 모두 출력합니다.


 입력
 자연수 N(3 <= N <= 10) 와 M (2 <= M <= N) 이 주어집니다.


 출력
 사전순으로 오름차순 출력


 예시 입력
 3 2

 예시 출력
 1 1
 1 2
 1 3
 2 1
 2 2
 2 3
 3 1
 3 2
 3 3
 * */
public class Part4 {

  static int n,m;
  static int pm[];

  static void DFS(int L){

    if(L == m) {
      for (int i : pm){
        System.out.print(i + " ");
      }
      System.out.println();
    } else {
      for(int i = 1; i <= n; i++){
        pm[L] = i;
        DFS(L+1);
      }
    }

  }

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);

    n = kb.nextInt();
    m = kb.nextInt();
    pm = new int[m];

    DFS(0);

  }

}
