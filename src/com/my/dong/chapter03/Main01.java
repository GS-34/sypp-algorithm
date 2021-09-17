package com.my.dong.chapter03;

//거스름돈
public class Main01 {

  public static void main(String[] args) {
    int n = 1260;//거스름돈

    int[] coinTypes = {500,100,50,10};
    int count = 0;

    for(int i = 0; i < coinTypes.length; i++){
      count += n / coinTypes[i];
      n = n % coinTypes[i];
    }

    System.out.println(count);

  }

}
