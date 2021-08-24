package com.my.dong.chapter11;

//곱하기 혹은 더하기
public class Main02 {

  public static void main(String[] args) {
    solution("02984");
  }

  public static void solution(String sInts){

    char[] cInts = sInts.toCharArray();

    int answer = cInts[0] - 48;

    for (int i = 1; i < cInts.length; i++){

      int num = cInts[i] - 48;

      if(answer <= 1 || num <= 1){
        answer += num;
      } else {
        answer*= num;
      }
    }

    System.out.println(answer);

  }

}
