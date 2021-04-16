package com.my.algorithm.chapter2.array;

import java.util.Scanner;

/***
 * 3. 가위 바위 보
 * 설명
 *
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 *
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 *
 * 예를 들어 N=5이면
 *
 * Image1.jpg
 *
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
 *
 * 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *
 * 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *
 *
 * 출력
 * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 *
 *
 * 예시 입력
 * 5
 * 2 3 3 1 3
 * 1 1 2 2 3
 *
 * 예시 출력
 * A
 * B
 * A
 * B
 * D
 */
public class Part3 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.next());

        int[][] ints = new int[2][n];

        for(int j = 0; j < 2; j++){
            for(int i = 0; i < n; i ++){
                ints[j][i] = kb.nextInt();
            }
        }

        for(int i = 0; i < n; i ++){
            int a = ints[0][i];
            int b = ints[1][i];
            if (a == b) System.out.println("D");
            else if (a == 1 && b == 3) System.out.println("A");
            else if (a == 2 && b == 1) System.out.println("A");
            else if (a == 3 && b == 2) System.out.println("A");
            else System.out.println("B");
        }


    }

}
