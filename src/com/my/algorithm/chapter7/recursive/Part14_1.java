package com.my.algorithm.chapter7.recursive;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 그래프 최단거리(BFS)
 기존방식으로 처리(레벨처리)

 다음 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.

6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5

 * */
public class Part14_1 {

  static int[][] graph;
  static int[] ch;
  static int[] distance;
  static int n;

  static void BFS(int start){

    Queue<Integer> q = new LinkedList();
    q.offer(start);
    ch[start] = 1;
    int L = 0;

    while (!q.isEmpty()) {

      int len = q.size();
      L++;

      for(int i = 0; i < len; i++){
        int fromNode = q.poll();
        for(int toNode = 1; toNode <= n; toNode++){
          if(graph[fromNode][toNode] == 1 && ch[toNode] == 0){
            q.offer(toNode);
            distance[toNode] = L;
            ch[toNode] = 1;
          }
        }

      }
    }

  }

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    n = kb.nextInt();// 노드(버택스)의 수
    int m = kb.nextInt();// 간선의 수

    graph = new int[n+1][n+1];
    ch = new int[n+1];
    distance = new int[n+1];

    for(int i = 1; i <= m; i++){
      int a = kb.nextInt();
      int b = kb.nextInt();
      graph[a][b] = 1;
    }

    BFS(1);


  }

}
