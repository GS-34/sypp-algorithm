package com.my.algorithm.string;

import java.util.Scanner;

/***
 * 10. 가장 짧은 문자거리
 * 설명
 *
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 *
 * 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 */
public class Part10 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String word = kb.next();
        char t = kb.next().charAt(0);

        char[] chars = word.toCharArray();
        int[] ints = new int[chars.length];
        int p = 10000;

        for(int i = 0; i < chars.length; i++){
            if(chars[i] == t) p = 0;
            else p++;
            ints[i] = p;
        }

        p = 10000;

        for(int i = chars.length-1; i >= 0; i--){
            if(chars[i] == t) p = 0;
            else p++;

            if(ints[i] > p) ints[i]= p;
        }

        for(int i : ints){
            System.out.print(i+ " ");
        }


    }

}
