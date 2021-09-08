package com.my.dong.chapter06;

/**
 * 정렬의 종류
 * 1. 선택정렬 : 가장 작은 요소를 선택. O(N2)
 * 2. 삽입정렬 : 특정한 데이터를 적절한 위치에 삽입. O(N2)
 *
 *
 */
public class Main01 {

  public static void main(String[] args) {

    int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

    selectSort(array.clone());
    insertSort(array.clone());

    quickSort(array, 0, array.length-1);
    printArray(array);

  }

  private static void selectSort(int[] array) {

    for (int i = 0; i < array.length; i++) {
      int minOffset = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minOffset]) {
          minOffset = j;
        }
      }

      swap(array, i, minOffset);
    }

    printArray(array);

  }

  private static void insertSort(int[] array) {

    for (int i = 1; i < array.length; i++) {
      for (int j = i; j > 0; j--){
        if(array[j-1] > array[j]){
          swap(array, j-1, j);
        } else {
          break;
        }
      }
    }

    printArray(array);

  }

  private static void quickSort(int[] array, int start, int end){

    //현재의 리스트 데이터 갯수가 1개인 경우
    if(start >= end) return;

    int pivot = start;

    int lt = start + 1;
    int rt = end;

    while (lt <= rt){

      //피벗보다 큰 데이터 찾기
      while (lt <= end && array[lt] <= array[pivot]) lt+=1;

      //피벗보다 작은 데이터 찾기
      while (rt > start && array[rt] >= array[pivot]) rt-=1;

      if(lt > rt){
        //엇갈렸다면 작은 값과 피벗을 교체
        swap(array, rt, pivot);
      } else {
        //엇갈리지 않았다면, 작은데이터와 큰데이터를 교체
        swap(array, lt, rt);
      }
    }

    //분할 이후 왼쪽/오른쪽 부분 각각 정렬수행
    quickSort(array, start,rt-1);
    quickSort(array, rt + 1, end);

  }

  private static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println(" ");
  }

  private static void swap(int[] array, int i1, int i2){
    int tmp = array[i1];
    array[i1] = array[i2];
    array[i2] = tmp;
  }


}
