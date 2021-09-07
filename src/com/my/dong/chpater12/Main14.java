//package com.my.dong.chpater12;
//
//import java.util.Arrays;
//
////외벽점검
//public class Main14 {
//
//  public static void main(String[] args) {
//
//    Solution solution = new Solution();
//
//    int n = 200;
//    int[] weak = new int[]{0,10,50,80,120,160};
//    int[] dist = new int[]{1,10,5,40,30};
//
//    System.out.println(solution.solution(n, weak, dist));
//
//  }
//
//}
//
//class Solution {
//
//  private int[] _weak;
//  private int[] _dist;
//  private int n;
//  private int min = Integer.MAX_VALUE;
//
//  public int solution(int n, int[] weak, int[] dist) {
//
//    this.n = n;
//    this._weak = weak;
//    Arrays.sort(dist);
//    this._dist = dist;
//
//    for (int i = 0; i < _weak.length; i++) {
//      solve(1, i, 0);
//    }
//
//    return min == Integer.MAX_VALUE ? -1 : min;
//  }
//
//  /**
//   * 현재의 친구(friendCount) 가
//   * 현재의 위치(pos) 에서
//   * 어디까지 취약점을 고칠 수 있는지 체크하는 메소드
//   */
//  private void solve(int friendCount, int pos, int visited){
//
//    if(friendCount > _dist.length) return;
//
//    if(min <= friendCount) return;
//
//    //for : 어디까지 고칠 수 있는가?
//    for(int i = 0; i < _weak.length; i++){
//      int nextPos = (pos + i) % _weak.length;
//      int diff = _weak[nextPos] - _weak[pos];
//
//      if(nextPos < pos)
//        diff+=n;
//
//      if(diff > _dist[_dist.length - friendCount]){
//        break;
//      }
//
//      visited |= 1 << nextPos;
//    }
//
//    if(visited == (1 << _weak.length) -1){
//      min = friendCount;
//      return;
//    }
//
//    //for : 다음 친구가 남은 위치에서 수리시작
//    for (int i = 0; i < _weak.length; i++){
//      if((visited & (1 << i)) != 0) continue;
//
//      solve(friendCount + 1, i, visited);
//
//    }
//
//  }
//
//
//
//}
