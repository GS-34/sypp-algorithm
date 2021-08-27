package com.my.algorithm.chapter7.recursive;

/**
 Tree 말단 노드까지의 가장 짧은 경로 (DFS)

 아래의 그림과같은 이진트리에서 루트노드 1에서 말단노드까지의 길이중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
 각결로의 길이는루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 갯수를 길이로 하겠습니다.
 * */
public class Part9 {


  static Node root;
  public static void main(String[] args) {
    root = new Node(1);
    root.lt = new Node(2);
    root.rt = new Node(3);
    root.lt.lt = new Node(4);
    root.lt.rt = new Node(5);
    root.rt.lt = new Node(6);
    root.rt.rt = new Node(7);
    System.out.println(DFS(0, root));

   }

  public static int DFS(int L, Node root){
    if(root.lt == null && root.rt == null) return L;
    else return Math.min(DFS(L+1, root.lt),DFS(L+1, root.rt));
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
