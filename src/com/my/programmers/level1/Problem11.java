package com.my.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 실패율
 * https://programmers.co.kr/learn/courses/30/lessons/42889
 */
public class Problem11 {

  public static void main(String[] args) {
    int[] stages = {2,1,2,6,2,4,3,3};
    solution(5, stages);
  }

  public static int[] solution(int N, int[] stages){

    ArrayList<StageInfo> stageInfoList = new ArrayList<>();

    for(int i = 0; i < N; i++){
      stageInfoList.add(new StageInfo(i+1));
    }

    for(int i = 0; i < stages.length; i++){

      int curUserStage = stages[i];

      if(curUserStage <= N) {
        stageInfoList.get(curUserStage-1).stay++;//머무른사람++
      } else {
        //모든 스테이지 완료자
        curUserStage = N;
      }

      for(int j = curUserStage; j > 0 ; j--){
        stageInfoList.get(j-1).pass++;//통과한사람++
      }
    }

    Collections.sort(stageInfoList);

    return stageInfoList
        .stream()
        .mapToInt(s->s.stage)
        .toArray();
  }

}

class StageInfo implements Comparable<StageInfo>{

  public int stage;
  public double stay;
  public int pass;
  public double failRate;

  public StageInfo(int stage) {
    this.stage = stage;
  }

  public double getFailRate() {
    if(pass > 0){
      failRate = stay / pass;
    } else {
      failRate = 0;
    }

    return failRate;
  }

  @Override
  public int compareTo(StageInfo o) {

    if(getFailRate() > o.getFailRate()){
      return -1;
    } else if (getFailRate() < o.getFailRate()){
      return 1;
    } else {
      if(stage < o.stage){
        return -1;
      } else {
        return 1;
      }
    }
  }
}