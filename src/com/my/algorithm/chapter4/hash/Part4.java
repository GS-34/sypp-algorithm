package com.my.algorithm.chapter4.hash;

import java.util.*;

/**
 4. 모든 아나그램 찾기
 설명

 S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.

 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.


 입력
 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.

 S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.


 출력
 S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.


 예시 입력
 bacaAacba
 abc

 예시 출력
 3

 힌트
 출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.

 */
public class Part4 {


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        char[] s = kb.next().toCharArray();
        char[] t = kb.next().toCharArray();

        int k = t.length;
        Map<Character,Integer> sMap = new HashMap();
        Map<Character,Integer> tMap = new HashMap();

        for(int i = 0; i < k; i++){
            tMap.put(t[i], tMap.getOrDefault(t[i],0)+1);
            if(i < k-1){
                sMap.put(s[i], sMap.getOrDefault(s[i],0)+1);
            }
        }

        int answer = 0;

        int l = 0;
        int r = k-1;

        while (r < s.length){

            sMap.put(s[r], sMap.getOrDefault(s[r],0)+1);
            if(tMap.equals(sMap)) answer++;

            if(sMap.containsKey(s[l])){
                int a = sMap.get(s[l]);
                a--;
                if(a <= 0) {
                    sMap.remove(s[l]);
                }else{
                    sMap.put(s[l], a);
                }
            }

            l++;
            r++;
        }

        System.out.print(answer);
        return;
    }

}
