package com.my.algorithm.chapter6.sort;

import java.util.Scanner;

/**
 3. 삽입 정렬
 설명

 N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.

 정렬하는 방법은 삽입정렬입니다.


 입력
 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.

 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.


 출력
 오름차순으로 정렬된 수열을 출력합니다.


 예시 입력
 6
 11 7 5 6 10 9

 예시 출력
 5 6 7 9 10 11
 */
public class Part3 {


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }


        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                int tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tmp;
                for(int j = i; j > 0; j--){
                    if(arr[j] < arr[j-1]){
                        int tmp2 = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = tmp2;
                    }
                }

            }
        }


        for(int i : arr)
            System.out.print(i + " ");

    }

}
