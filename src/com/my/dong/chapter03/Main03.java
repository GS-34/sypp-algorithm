package com.my.dong.chapter03;

import java.util.Arrays;

//숫자 카드 게임
public class Main03 {

  public static void main(String[] args) {

    int[][] cards =
        {
            {3,1,2},
            {4,1,4},
            {2,2,2},
            {4,1,4}
        };


    int idx = -1;
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < cards.length; i++){
      Arrays.sort(cards[i]);
      if(max < cards[i][0]){
        idx = i;
        max = cards[i][0];
      }
    }

    System.out.println(idx);
  }

}