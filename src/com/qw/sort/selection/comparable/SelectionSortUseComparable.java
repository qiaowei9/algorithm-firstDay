package com.qw.sort.selection.comparable;

import com.qw.sort.selection.Student;

/*
* 使用comparable 进行选择排序
* 多种类型都可使用
* */
public class SelectionSortUseComparable {

    public static void sort(Comparable[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++){

            int minIndex = i;
            for (int j=i+1; j<n; j++){

                if (arr[j].compareTo(arr[minIndex])<0){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }


    private static void swap(Object[] arr, int i, int j){
        Object temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        Integer[] arr = {8,5,4,3,6,1,2,7,9};
        SelectionSortUseComparable.sort(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");

        String[] strArr = {"D","B","C","A"};
        SelectionSortUseComparable.sort(strArr);
        for (int i=0; i<strArr.length; i++){
            System.out.print(strArr[i] + "  ");
        }
        System.out.println("");

        Double[] doubles = {3.2,5.4,2.1,8.6,4.1,7.5};
        SelectionSortUseComparable.sort(doubles);
        for (int i=0; i<doubles.length; i++){
            System.out.print(doubles[i] + "  ");
        }
        System.out.println("");

        Long[] longs = {55555555555L,76584231L,1234567L,};
        SelectionSortUseComparable.sort(longs);
        for (int i=0; i<longs.length; i++){
            System.out.print(longs[i] + "  ");
        }
        System.out.println("");

        Student[] students = new Student[4];
        students[0] = new Student("张三",59);
        students[1] = new Student("李四",80);
        students[2] = new Student("王五",75);
        students[3] = new Student("赵六",90);
        SelectionSortUseComparable.sort(students);
        for (int i=0; i<students.length; i++){
            System.out.println(students[i]+" ");
        }

    }
}
