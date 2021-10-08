package com.my.programmers.level1;

/**
 * 키패드 누르기 https://programmers.co.kr/learn/courses/30/lessons/67256
 */
public class Problem10 {

  static int rPos = 12;
  static int lPos = 10;

  public static void main(String[] args) {

//    int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    String hand = "right";

    System.out.println(solution(numbers, hand));

  }

  private static int calCol(int num){

    int rtn = num % 3;
    return rtn == 0 ? 3 : rtn;
  }

  private static int calRow(int num){
    int n = num % 3 > 0 ? 1 : 0;
    return num / 3 + n;
  }

  private static String solution(int[] numbers, String hand) {

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < numbers.length; i++){

      int num = numbers[i] == 0 ? 11 : numbers[i];

      int col = calCol(num);
      int row = calRow(num);

      switch (col){
        case 3:
          sb.append("R");
          rPos = num;
          break;
        case 1:
          sb.append("L");
          lPos = num;
          break;
        case 2:
          int rCol = calCol(rPos);
          int rRow = calRow(rPos);
          int rDist = Math.abs(rCol-col) + Math.abs(rRow-row);

          int lCol = calCol(lPos);
          int lRow = calRow(lPos);
          int lDist = Math.abs(lCol-col) + Math.abs(lRow-row);

          if(rDist == lDist){

            if(hand.equals("right")){
              sb.append("R");
              rPos = num;
            } else{
              sb.append("L");
              lPos = num;
            }

          } else if (rDist > lDist){
            sb.append("L");
            lPos = num;
          } else {
            sb.append("R");
            rPos = num;
          }
          break;
        default:
          System.out.println("?!");
          break;
      }

    }

    return sb.toString();
  }

}

//LLRLLRLLRL
//LLRLLRLLRL