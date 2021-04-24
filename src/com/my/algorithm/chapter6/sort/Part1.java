package com.my.algorithm.chapter6.sort;

import java.util.Scanner;

/**
 1. 선택 정렬
 (왼쪽에서 부터 시작해서 오른쪽에 가장 작은 수의 idx 를 검색 왼쪽으로 스왑하여 왼쪽에서 오른쪽으로 정렬)
 설명

 N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.

 정렬하는 방법은 선택정렬입니다.

 입력
 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.

 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

 출력
 오름차순으로 정렬된 수열을 출력합니다.

 예시 입력
 6
 13 5 11 7 23 15

 예시 출력
 5 7 11 13 15 23
 */
public class Part1 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[] ints = new int[n];

        for(int i = 0; i < n; i++){
            ints[i] = kb.nextInt();
        }

        for(int i = 0; i < n-1; i++){

            int idx = i;

            for(int j = i+1; j < n; j++){
                if(ints[j] < ints[idx]) idx = j;//i 이후의 값들중 가장 작은 값의 idx 를 추출
            }

            //맨앞의 인덱스(i) 와 가장작은 값의 (idx) 위치를 스왑
            int tmp = ints[i];
            ints[i] = ints[idx];
            ints[idx] = tmp;
        }

        for(int i : ints)
            System.out.print(i + " ");

    }

}
