package com.my.algorithm.chapter6.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 7. 좌표 정렬
 설명

 N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.

 정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.


 입력
 첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.

 두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.


 출력
 N개의 좌표를 정렬하여 출력하세요.


 예시 입력 1

 5
 2 7
 1 3
 1 2
 2 5
 3 6

 예시 출력 1

 1 2
 1 3
 2 5
 2 7
 3 6

 */
public class Part7 {


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        ArrayList<Point> list = new ArrayList();

        for(int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            list.add(new Point(x, y));
        }

        Collections.sort(list);

        for (Point p : list){
            System.out.println(p);
        }
        return;

    }

    static class Point implements Comparable<Point> {

        private int x;
        private int y;

        public Point (int x, int y){
            this.x = x;
            this.y = y;
        }

        /**
        * this 를 왼쪽으로 보내고 싶으면 음수 return
         * this.x - o.x 를 하면 this.x 가 작을경우 왼쪽으로 배치되며 오름차순 완성
        * */
        @Override
        public int compareTo(Point p) {
            if(this.x == p.x) return this.y - p.y;
            return this.x - p.x;
        }

        @Override
        public String toString(){
            return x + " " + y;
        }
    }

}
