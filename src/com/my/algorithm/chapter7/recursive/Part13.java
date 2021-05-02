package com.my.algorithm.chapter7.recursive;

import java.util.ArrayList;
import java.util.Scanner;

/**
 경로탐색 (인접 리스트) :
 행열의경우 큰수가 들어오면 비효율적이다
 인접리스트로 해보자..


 방향그래프가 주어지면 1번정점에서 N 번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
 아래 그래프에서 1번에서 5번정점으로 가는 가지수는

 1 <-> 2 -> 5
 ▼    ⌃
 3 -> 4

 1 2 3 4 5
 1 2 5
 1 3 4 2 5
 1 3 4 5
 1 4 2 5
 1 4 5

 답 : 6 가지

 입력예시

5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5


 * */
public class Part13 {

  static ArrayList<Integer>[] graph;
  static int goal = 5;
  static int start = 1;
  static int count = 0;
  static int[] ch;

  public static void DFS(int fromNode) {
    if (fromNode == goal) {
      count++;
      return;
    } else {
      for(int toNode : graph[fromNode]){
        if(ch[toNode] == 0){
          ch[toNode] = 1;
          DFS(toNode);
          ch[toNode] = 0;
        }
      }
    }
  }

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();// 노드(버택스)의 수
    int m = kb.nextInt();// 간선의 수

    graph = new ArrayList[n+1];
    ch = new int[n + 1];

    for (int i = 1; i < n; i++){
      graph[i] = new ArrayList();
    }

    for (int i = 1; i <= m; i++) {
      int a = kb.nextInt();
      int b = kb.nextInt();
      graph[a].add(b);
    }

    ch[start] = 1;
    DFS(start);

    System.out.println(count);

  }

}
