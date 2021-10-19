package com.my.programmers.level1;

/*
약수의 개수와 덧셈
https://programmers.co.kr/learn/courses/30/lessons/77884
 */
public class Problem12 {

  public static void main(String[] args) {

    System.out.println(solution(1, 2));
  }

  private static int solution(int left, int right) {

    int answer = 0;

    for (int i = left; i <= right; i++) {

      int divisor;

      if (i == 1) {
        divisor = 1;
      } else {
        divisor = 2;//1 & 자기자신
      }

      for (int j = 2; j <= i / 2; j++) {
        if (i % j == 0) {
          divisor++;
        }
      }

      if (divisor % 2 == 0) {
        answer += i;
      } else {
        answer -= i;
      }

    }

    return answer;
  }

  public int betterSolution(int left, int right) {
    int answer = 0;

    for (int i = left; i <= right; i++) {
      //제곱수인 경우 약수의 개수가 홀수
      if (i % Math.sqrt(i) == 0) {
        answer -= i;
      }
      //제곱수가 아닌 경우 약수의 개수가 짝수
      else {
        answer += i;
      }
    }

    return answer;
  }

}
