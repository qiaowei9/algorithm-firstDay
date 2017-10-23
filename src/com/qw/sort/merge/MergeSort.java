package com.qw.sort.merge;

import com.qw.sort.util.SortTestHelper;

import java.util.Arrays;

/*
* 归并排序
*
* */
public class MergeSort {

    /*
    * 使用递归 对数组arr 进行从 [l,mid], [mid+1,r] 进行归并
    *
    * */
    public static void merge(Comparable[] arr, int l, int mid, int r){

        Comparable[] aux = Arrays.copyOfRange(arr,l,r+1);
        //初始化 i指向数组开始的位置 j指向右半部分数组开始的位置
        int i = l;
        int j = mid+1;
        for (int k = l; k <= r; k++){
            if (i > mid){
                //l个偏移量，所以需要减l
                arr[k] = aux[j-l];
                j++;
            }else if(j > r){
                arr[k] = aux[i-l];
                i++;
            } else if (aux[i-l].compareTo(aux[j-l]) < 0){
                arr[k] = aux[i-l];
                i++;
            }else{
                arr[k] = aux[j-l];
                j++;
            }

        }




    }
    public static void sort(Comparable[] arr,int l,int r){

        if (l>=r){
            return;
        }
        int mid =  (l+r)/2;
        sort(arr,0,mid);
        sort(arr,mid+1,r);
        merge(arr,l,mid,r);

    }

    public static void sort(Comparable[] arr){
        int n = arr.length;
        sort(arr,0,n-1);

    }

    public static void main(String[] args) {

        Integer[] arr =  {1,5,7,2,4,6,3,8,9};
sort(arr);
       // Integer[] arr1 =  Arrays.copyOfRange(arr,0,arr.length+1);
        SortTestHelper.printArray(arr);


    }
}
