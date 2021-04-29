package com.my.algorithm.chapter7.recursive;

import java.util.LinkedList;
import java.util.Queue;

/**
 Tree 말단 노드까지의 가장 짧은 경로(BFS)

 아래의 그림과같은 이진트리에서 루트노드 1에서 말단노드까지의 길이중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
 각결로의 길이는루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 갯수를 길이로 하겠습니다.
 * */
public class Part10 {


  static Node root;
  public static void main(String[] args) {
    root = new Node(1);
    root.lt = new Node(2);
    root.rt = new Node(3);
    root.lt.lt = new Node(4);
    root.lt.rt = new Node(5);
    root.rt.lt = new Node(6);
    root.rt.rt = new Node(7);
    System.out.println(BFS(root));

  }

  public static int BFS(Node root){

    int L = 0;
    Queue<Node> q = new LinkedList();
    q.offer(root);

    while (!q.isEmpty()){

      int len = q.size();

      for(int i = 0; i < len; i ++){
        Node node = q.poll();
        if(node.lt == null && node.rt == null) return L;

        if (node.lt != null) q.offer(node.lt);
        if (node.rt != null) q.offer(node.rt);
      }

      L++;
    }

    return L;

  }

  static class Node {
    int data;
    Node lt, rt;
    public Node(int val){
      data = val;
      lt=rt=null;
    }
  }

}
