/**
 * 크레인 인형뽑기 게임
 */

package com.my.programmers.level1;


import java.util.Stack;

public class Problem8 {

  public static void main(String[] args) {

    int[][] board =
        {
            {0,0,0,0,0},//0.0 , 0.1 , 0.2, 0.3 ,0.4
            {0,0,1,0,3},//1.0 ,
            {0,2,5,0,1},//2.0 ,
            {4,2,4,4,2},//3.0 ,
            {3,5,1,3,1} //4.0 ,
        };
    int[] moves = {1,5,3,5,1,2,1,4};

    System.out.println(solution(board, moves));

  }

  public static int solution(int[][] board, int[] moves) {

    Stack<Integer> myStack = new Stack();
    int hit = 0;

    for(int i = 0; i < moves.length; i++){
      int move = moves[i]-1;
      int pick = 0;

      for(int j = 0; j < board.length; j++){
        pick = board[j][move];

        if(pick > 0) {
          board[j][move] = 0;
          break;
        }
      }

      if(pick > 0) {
        if(!myStack.isEmpty() && myStack.peek() == pick) {
          myStack.pop();
          hit+=2;
        } else {
          myStack.push(pick);
        }
      }
    }

    return hit;
  }

}
