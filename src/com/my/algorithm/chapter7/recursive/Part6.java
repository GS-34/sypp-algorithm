package com.my.algorithm.chapter7.recursive;


/**
  부분집합 구하기(DFS)

 자연수 N 이 주어지면 1부터 N 까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.

 출력설명
 각줄에 하나씩 부분집합을 아래 출력예제와 같은 순서로 출력한다.
 공집합은 출력하지 않는다.

 입력예제1
 3

 출력예제
 1 2 3
 1 2
 1
 2 3
 2
 3
 * */
public class Part6 {

  static int n = 0;
  static int[] ch;
  public static void main(String[] args) {
    n = 3;
    ch = new int[n+1];
    DFS(1);
  }

  public static void DFS(int L){
    if(L == n+1) {
      StringBuilder sb = new StringBuilder();
      for(int i = 1; i <= n; i++){
        if(ch[i] == 1) sb.append(i + " ");
      }
      if (sb.toString().length() > 0) System.out.println(sb.toString());
    }else{
      ch[L] = 1;
      DFS(L+1);
      ch[L] = 0;
      DFS(L+1);
    }
  }

}
