package com.my.dong.chapter14;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main26 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int[] array = new int[n];

    for(int i = 0; i < n; i ++){
      array[i] = scanner.nextInt();
    }

    System.out.println(solution(array));

  }

  private static int solution(int[] array){

    Arrays.sort(array);

    Queue<Integer> q = new LinkedList();

    for (int i = 0; i < array.length; i++){
      q.offer(array[i]);
    }


    int answer = q.poll();

    for(int i = 0; i < q.size(); i++){
      int a = q.poll();
      answer += a;
      q.offer(answer);
    }

    for(int i = 0; i < q.size(); i++){
      int a = q.poll();
      answer += a;
    }

    return answer;
  }

}
