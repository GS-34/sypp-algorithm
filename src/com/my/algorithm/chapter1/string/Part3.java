package com.my.algorithm.chapter1.string;

import java.util.Scanner;

/**
 * 3. 문장 속 단어
 * 설명
 *
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 *
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 * 단어를 답으로 합니다.
 */
public class Part3 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        String[] array = str.split(" ");

        int min = Integer.MIN_VALUE;
        String answer = "";
        for(String word : array){
            if(min < word.length()) {
                min = word.length();
                answer = word;
            }
        }

        System.out.println(answer);
        return ;

    }
}
