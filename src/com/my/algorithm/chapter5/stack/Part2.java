package com.my.algorithm.chapter5.stack;

import java.util.Scanner;
import java.util.Stack;

/**

 2. 괄호문자제거

 설명
 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.

 입력
 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

 출력
 남은 문자만 출력한다.

 예시 입력
 (A(BC)D)EF(G(H)(IJ)K)LM(N)

 예시 출력
 EFLM

 */
public class Part2 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        char[] chars = kb.next().toCharArray();

        Stack<Character> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == '('){
                stack.push(chars[i]);
            } else if(chars[i] == ')'){
                stack.pop();
            } else if(stack.isEmpty()) {
                sb.append(chars[i]);
            }
        }

        System.out.println(sb.toString());

        return;
    }

}
