package com.my.algorithm.search;

/**
 * 선형검색
 * */
public class SeqSearch {

  public static void main(String[] args) {

    int[] array = {1,2,3,4,5,6,7,8,9};

    int findNum = 7;

    int idx = -1;

    for(int i = 0; i < array.length; i++){
      if(array[i] == findNum) {
        idx = i;
        break;
      }
    }

    if(idx < 0){
      System.out.println("찾는 숫자 없음");
    } else {
      System.out.println(idx + "번째 "+ findNum +" 있음");
    }


  }

}
