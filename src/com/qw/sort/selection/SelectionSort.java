package com.qw.sort.selection;

/*
* 选择排序
*  从数组中依次找最小的 与循环次数对应位置元素交换
*  如： [10,8,7,5,9,2,4,1,3,6]
*  第一遍循环结果 1,8,7,5,9,2,4,10,3,6
*
* */
public class SelectionSort {


    /*
    * arr[]: 需要排序的数组
    * n： 数组长度
    * */

    public static void  sort(int arr[]){
        int n =  arr.length;
        for ( int i = 0 ; i < n ; i++){
            int minIndex = i; //记录最小数的下标
            for (int j = i+1 ; j < n; j++){//找最小值的索引
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr,minIndex,i);
        }
    }

    /*
    * 数组中元素交换位置
    * */
    private static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {10,8,9,7,5,6,4,2,3,1};
        SelectionSort.sort(arr);

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }

    }
}
