package com.my.algorithm.chapter8.dfsbfs;

import java.util.Scanner;

/**
 3. 최대점수 구하기(DFS)
 설명

 이번 정보올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고 합니다.

 각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 됩니다.

 제한시간 M안에 N개의 문제 중 최대점수를 얻을 수 있도록 해야 합니다.

 (해당문제는 해당시간이 걸리면 푸는 걸로 간주한다, 한 유형당 한개만 풀 수 있습니다.)


 입력
 첫 번째 줄에 문제의 개수N(1<=N<=20)과 제한 시간 M(10<=M<=300)이 주어집니다.

 두 번째 줄부터 N줄에 걸쳐 문제를 풀었을 때의 점수와 푸는데 걸리는 시간이 주어집니다.


 출력
 첫 번째 줄에 제한 시간안에 얻을 수 있는 최대 점수를 출력합니다.


 예시 입력
 5 20
 10 5
 25 12
 15 8
 6 3
 7 4

 예시 출력
 41
 * */
public class Part3 {

  static int n,m,max;
  static Quiz[] quizzes;


  static void DFS(int L, int scores, int times){

    //타임이 초과하는 부분집합은 버린다.
    if(times > m) return;

    if(L == n) {

      if(max < scores) max = scores;

      return;
    } else {

      DFS(L+1, scores + quizzes[L].score, times + quizzes[L].time);
      DFS(L+1, scores, times);
    }

  }

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);

    n = kb.nextInt();
    m = kb.nextInt();

    quizzes = new Quiz[n];
    for(int i = 0; i < n; i++){
      int score = kb.nextInt();
      int time = kb.nextInt();
      quizzes[i] = new Quiz(score,time);
    }

    DFS(0,0,0);

    System.out.println(max);

  }

  static class Quiz{

    public Quiz(int score, int time){
      this.score = score;
      this.time = time;
    }

    public int score;
    public int time;

  }

}
