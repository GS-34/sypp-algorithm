package com.my.algorithm.chapter3.pointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/***
 1. 두 배열 합치기
 설명

 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.


 입력
 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.

 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.

 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.

 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.


 출력
 오름차순으로 정렬된 배열을 출력합니다.


 예시 입력
 3
 1 3 5
 5
 2 3 6 7 9

 예시 출력
 1 2 3 3 5 6 7 9
 */
public class Part1 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.next());
        int[] nInts = new int[n];

        for(int i = 0; i < n; i++){
            nInts[i] = kb.nextInt();
        }

        int m = Integer.parseInt(kb.next());
        int[] mInts = new int[m];

        for(int i = 0; i < m; i++){
            mInts[i] = kb.nextInt();
        }

//        doStream(nInts, mInts);
        doOrigin(nInts, mInts);

    }

    public static void doStream(int[] nInts, int[] mInts){
        IntStream
            .concat(IntStream.of(nInts), IntStream.of(mInts))
            .sorted()
            .forEach(i -> System.out.print(i + " "));
    }

    public static void doOrigin(int[] nInts, int[] mInts){

        List answer = new ArrayList<>();

        int p1 = 0 , p2 = 0;

        while (p1 < nInts.length && p2 < mInts.length){
            if(nInts[p1] < mInts[p2]){
                answer.add(nInts[p1]);
                p1++;
            } else {
                answer.add(mInts[p2]);
                p2++;
            }
        }

        while (p1 < nInts.length) answer.add(nInts[p1++]);
        while (p2 < mInts.length) answer.add(mInts[p2++]);


        answer.forEach(i -> System.out.print(i + " "));


    }

}
