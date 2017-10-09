package com.qw.sort.insertion;


import com.qw.sort.util.SortTestHelper;

/*
* 插入排序
*   [8,6,2,3,1,7,5,4]
*   1: [6,8,2,3,1,7,5,4]
*   2： [2,6,8,3,1,7,5,4]
*   每个位置的与前一个位置进行比较，知道找到合适的位置停止
* */
public class InsertionSort {

    public static void sort(Comparable[] arr){

        int l = arr.length;
        //方法1
       /*
        for (int i=1; i< l; i++){
            for (int j=i; j>0 && arr[j].compareTo(arr[j-1])<0 ; j--){
                    SortTestHelper.swap(arr,j, j-1);
            }
        }*/


        for (int i=1; i<l; i++){
            Comparable c = arr[i];
            int j = i;
            for (; j>0 && arr[j-1].compareTo(c)>0; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = c;
        }

    }



    public static void main(String[] args) {

        int N = 100;
        Integer[] arr = SortTestHelper.generateRandomArray(N,0,N);
        sort(arr);
        SortTestHelper.printArray(arr);
    }
}
