package com.my.algorithm.chapter6.sort;

import java.util.Scanner;

/**
 2. 버블 정렬
 (왼쪽부터 시작해서 2개씩 숫자를 비교하여 둘중 큰수가 오른쪽으로 스왑되며 오른쪽부터 정렬)
 설명

 N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.

 정렬하는 방법은 버블정렬입니다.


 입력
 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.

 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.


 출력
 오름차순으로 정렬된 수열을 출력합니다.


 예시 입력 1
 6
 13 5 11 7 23 15

 예시 출력 1
 5 7 11 13 15 23
 */
public class Part2 {


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }

        for(int i = n-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }


        for(int i : arr)
            System.out.print(i + " ");

    }

}
