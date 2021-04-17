package com.my.algorithm.chapter2.array;

import java.util.Random;
import java.util.Scanner;

/***
 9. 격자판 최대합
 설명
 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 ㅁ ㅁ ㅁ ㅁ ㅁ
 ㅁ ㅁ ㅁ ㅁ ㅁ
 ㅁ ㅁ ㅁ ㅁ ㅁ
 ㅁ ㅁ ㅁ ㅁ ㅁ
 ㅁ ㅁ ㅁ ㅁ ㅁ

 N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


 입력
 첫 줄에 자연수 N이 주어진다.(2<=N<=50)

 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


 출력
 최대합을 출력합니다.


 예시 입력 1
 5
 10 13 10 12 15
 12 39 30 23 11
 11 25 50 53 15
 19 27 29 37 27
 19 13 30 13 19

 예시 출력 1
 155
 */
public class Part9 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[][] ints = new int[n][n];

        Random random = new Random();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j ++){
//                ints[i][j] = kb.nextInt();
                ints[i][j] = random.nextInt(50)+1;
            }
        }

        int max = 0;

        int sum3 = 0;
        int sum4 = 0;

        for(int i = 0; i < n; i++){

            int sum1 = 0;
            int sum2 = 0;

            for(int j = 0; j < n; j ++){
                sum1 += ints[i][j];
                sum2 += ints[j][i];
            }

            sum3+=ints[i][i];
            sum4+=ints[i][n-i-1];

            if(max < sum1) max = sum1;
            if(max < sum2) max = sum2;
        }

        if(max < sum3) max = sum3;
        if(max < sum4) max = sum4;


        System.out.print(max);



    }

}
