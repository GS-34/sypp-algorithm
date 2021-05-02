package com.my.algorithm.chapter7.recursive;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 그래프 최단거리(BFS)
 기존방식으로 처리(배열로 처리)

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
public class Part14_2 {

  static int[] ch;
  static int[] distance;
  static int n;
  static ArrayList<ArrayList<Integer>> graph;

  static void BFS(int fromNode){

    Queue<Integer> q = new LinkedList();
    q.offer(fromNode);
    ch[fromNode] = 1;

    while (!q.isEmpty()){
      fromNode = q.poll();
      for(int toNode : graph.get(fromNode)){
        if(ch[toNode] != 1){
          distance[toNode] = distance[fromNode] + 1;
          ch[toNode] = 1;
          q.offer(toNode);
        }
      }
    }
  }

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    n = kb.nextInt();// 노드(버택스)의 수
    int m = kb.nextInt();// 간선의 수

    ch = new int[n+1];
    distance = new int[n+1];

    graph = new ArrayList<>();

    for(int i = 0; i < n+1; i++){
      graph.add(new ArrayList<Integer>());
    }

    for(int i = 1; i <= m; i++){
      int a = kb.nextInt();
      int b = kb.nextInt();

      graph.get(a).add(b);

    }

    BFS(1);

    for(int dis : distance){
      System.out.print(dis + " ");
    }

    return;

  }

}
