package com.my.algorithm.chapter7.recursive;

import java.util.LinkedList;
import java.util.Queue;

/**
  이진트리 순회(넓이 우선 탐색(BFS): 레벨탐색)
 * */
public class Part7 {

  public static void BFS(Node root){

    Queue<Node> q = new LinkedList<>();
    q.offer(root);

    int L = 0;//level

    while (!q.isEmpty()){
      int len = q.size();
      System.out.print(L + " : ");
      for(int i = 0; i < len; i++){
        Node cur = q.poll();
        System.out.print(cur.data + " ");
        if(cur.lt != null) q.offer(cur.lt);
        if(cur.rt != null) q.offer(cur.rt);
      }
      L++;
      System.out.println();
    }

  }

  public static void main(String[] args) {

    Node root = new Node(1);
    root.lt = new Node(2);
    root.rt = new Node(3);
    root.lt.lt = new Node(4);
    root.lt.rt = new Node(5);
    root.rt.lt = new Node(6);
    root.rt.rt = new Node(7);

    BFS(root);

  }

  static class Node {

    public Node(int data){
      this.data = data;
    }

    private int data;
    private Node lt;
    private Node rt;
  }

}
