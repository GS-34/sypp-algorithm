package com.my.programmers.level1;

/*
3진법 뒤집기
https://programmers.co.kr/learn/courses/30/lessons/68935
 */
public class Problem13 {

  public static void main(String[] args) {
    solution(45);
  }

  private static int solution(int n){

    StringBuilder sb = new StringBuilder();

    while (n > 0){
      sb.append(n % 3);
      n /= 3;
    }

    return Integer.parseInt(sb.toString(),3);
  }



}
