package com.my.dong.chapter03;

import java.util.Arrays;

public class Main02 {

  public static void main(String[] args) {

    int[] nums = {2,4,5,4,6};
    int m = 8;//총 더하기 횟수
    int k = 3;//최대수를 연속으로 사용 할 수 있는 횟수

    Arrays.sort(nums);

    int answer = 0;

    for(int i = 1; i <= m; i++){
      if(i % (k+1) != 0) {
        answer+=nums[nums.length-1];
      }
      else {
        answer+=nums[nums.length-2];
      }
    }

    System.out.println(answer);

  }

}
