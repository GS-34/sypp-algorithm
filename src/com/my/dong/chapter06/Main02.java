package com.my.dong.chapter06;

//학생 점수 오름차순 정렬
public class Main02 {

  public static void main(String[] args) {
    Student[] students = {
        new Student("A",100),
        new Student("B",90),
        new Student("C",95),
        new Student("D",40),
        new Student("E",80),
        new Student("F",30),
    };

    solution(students);
  }

  private static void printArray(Student[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i].getName() + " ");
    }
    System.out.println(" ");
  }

  private static void swap(Student[] students, int i1, int i2){
    Student tmp = students[i1];
    students[i1] = students[i2];
    students[i2] = tmp;
  }

  private static void solution(Student[] students) {

    selectSort(students.clone());
    insertSort(students.clone());


    Student[] students2 = students.clone();
    quickSort(students2, 0, students.length-1);
    printArray(students2);
  }

  private static void selectSort(Student[] students){

    for(int i = 1; i < students.length; i++){

      int minOffset = i-1;

      for(int j = i; j < students.length; j++){

        if(students[j].getScore() < students[minOffset].getScore()){
          swap(students,minOffset,j);
        }

      }
    }

    printArray(students);

  }

  private static void quickSort(Student[] students, int start, int end){

    if(end <= start) return;

    int pivot = start;

    int lt = start +1;
    int rt = end;

    while (lt <= rt) {

      //피벗보다 작은값을 찾는다.
      while (lt <= end && students[lt].getScore() <= students[pivot].getScore()) lt++;

      //피벗보다 큰값을 찾는다.
      while (rt > start && students[rt].getScore() >= students[pivot].getScore()) rt--;

      if(lt > rt){
        //모두 다 정렬했다면 큰값과 피벗을 스왑
        swap(students, rt, pivot);
      } else{
        //작은값과 작은값을 스왑
        swap(students, lt, rt);
      }
    }

    quickSort(students, start, rt-1);
    quickSort(students, rt+1, end);



  }

  private static void insertSort(Student[] students){

    for(int i = 1; i < students.length; i++){
      for(int j = i; j > 0; j--){
        if(students[j-1].getScore() > students[j].getScore()){
          swap(students,j-1,j);
        }
      }
    }

    printArray(students);

  }

}

class Student {

  private String name;
  private int score;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }


  public int getScore(){
    return score;
  }

  public String getName(){
    return name;
  }
}
