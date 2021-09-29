package com.my.programmers.level1;

import java.util.HashMap;

/**
 * 숫자문자열과 영단어
 * https://programmers.co.kr/learn/courses/30/lessons/81301?language=java
 */

public class Problem9 {

  static HashMap<String, Integer> map = new HashMap<>();

  public static void main(String[] args) {
    map.put("zero",0);
    map.put("one",1);
    map.put("two",2);
    map.put("three",3);
    map.put("four",4);
    map.put("five",5);
    map.put("six",6);
    map.put("seven",7);
    map.put("eight",8);
    map.put("nine",9);

    System.out.println(mySolution("one4seveneight"));
    System.out.println(mySolution("23four5six7"));
    System.out.println(mySolution("2three45sixseven"));
    System.out.println(mySolution("123"));

    System.out.println(solution("one4seveneight"));
    System.out.println(solution("23four5six7"));
    System.out.println(solution("2three45sixseven"));
    System.out.println(solution("123"));

  }

  public static int mySolution(String s) {

    char[] chars = s.toCharArray();

    StringBuilder word = new StringBuilder();
    StringBuilder answer = new StringBuilder();

    for (int i = 0; i < chars.length; i++) {

      if (48 <= chars[i] && chars[i] <= 57) {
        answer.append(chars[i]);
      } else {

        word.append(chars[i]);

        if(map.containsKey(word.toString())){
          answer.append(map.get(word.toString()));
          word.setLength(0);
        }

      }

    }

    return Integer.parseInt(answer.toString());

  }

  public static int solution(String s) {

    String[] sArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};


    for (int i = 0; i < sArray.length; i++) {

      if(s.contains(sArray[i])){
        s = s.replaceAll(sArray[i], String.valueOf(i));
      }

    }

    return Integer.parseInt(s);

  }

}
