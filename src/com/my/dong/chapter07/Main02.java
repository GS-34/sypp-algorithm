package com.my.dong.chapter07;

import java.util.Arrays;

//부품찾기
public class Main02 {

  public static void main(String[] args) {
    int[] mArray = {8,3,7,9,2};
    int[] cArray = {8,3,7};
    solution(mArray,cArray);
  }


  public static boolean solution(int[] mArray, int[] cArray) {

    Arrays.sort(mArray);


    boolean rtn = true;

    for (int i = 0; i < cArray.length; i++) {

      int target = cArray[i];
      boolean has = false;

      int start = 0;
      int end = mArray.length-1;

      while (start <= end) {
        int mid = (start + end) / 2;

        if (mArray[mid] == target) {
          has = true;
          break;
        } else if(mArray[mid] < target){
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }

      if(!has) {
        rtn = false;
        break;
      }

    }

    return rtn;

  }

}
