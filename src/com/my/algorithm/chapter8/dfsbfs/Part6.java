package com.my.algorithm.chapter8.dfsbfs;

import java.util.Scanner;

/**

 6. 순열구하기

 10이하의 N개의 자연수가 주어지면 이 중 M 개를 뽑아 일렬로 나열하는 방법을 모두 출력

 입력설명
 첫째줄 : 자연수 N ( 3 <= N <= 10) 과 M (2 <= M <= N)
 둘째줄 : N개의 자연수가 오름차순으로

 출력설명
 출력순서는 사전순으로 오름차순

 입력예제
 3 2
 3 6 9

 출력예제
 3 6
 3 9
 6 3
 6 9
 9 3
 9 6

 * */
public class Part6 {

  static int n, m;
  static int[] numbers;
  static int[] print;
  static int[] ch;

  static void DFS(int L){

    if (L == m) {
      for( int n : print) {
        System.out.print(n + " ");
      }
      System.out.println();
    } else {
      for(int i = 0; i < n; i++){
        if(ch[i] <= 0){
          print[L] = numbers[i];
          ch[i] = 1;
          DFS(L+1);
          ch[i] = 0;
        }
      }
    }

  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    n = kb.nextInt();//자연수 갯수
    m = kb.nextInt();//뽑는 횟수
    numbers = new int[n];
    ch = new int[n];
    print = new int[m];

    for(int i = 0; i < n; i++){
      numbers[i] = kb.nextInt();
    }

    DFS(0);



  }

}
