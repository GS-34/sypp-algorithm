package com.my.dong.chapter08;

//개미전사 (220p)
//다이나믹 프로그래밍
public class Main03 {



  public static void main(String[] args) {

    int[] shortages = {1,3,1,5,6,7};

    bottomUp(shortages);

  }

  //바텀업 방식(상향식)
  private static void bottomUp(int[] shortages){
    int[] d = new int[100];
    int n = shortages.length;

    d[0] = shortages[0];
    d[1] = Math.max(shortages[0], shortages[1]);

    for(int i = 2; i < n; i++){
      d[i] = Math.max(d[i-1], d[i-2] + shortages[i]);
    }

    System.out.println(d[n-1]);
  }


}
