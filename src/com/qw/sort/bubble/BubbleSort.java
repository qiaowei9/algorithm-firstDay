package com.qw.sort.bubble;

import com.qw.sort.util.SortTestHelper;

public class BubbleSort {

    public static void sort(Comparable[] arr){



        int len =  arr.length;

        /*for (int i=0; i<len - 1; i++){
            boolean flag = true;
            for (int j=0; j<len -1 - i; j++){

                if (arr[j].compareTo(arr[j+1])>0){

                   SortTestHelper.swap(arr,j,j+1);
                    flag = false;
                }
            }
            if (flag){//没有进行内层循环， 说明不需要排序 跳出循环
                break;
            }
        }*/

         int n;
         do {
             n = 0;
             for (int i=1; i < len; i++){
                if(arr[i-1].compareTo(arr[i])>0){
                    SortTestHelper.swap(arr,i-1,i);
                    n = i;//记录最后一次交换的位置，下一轮的扫描不对该位置进行扫描
                }
             }
            len = n;
         }while (n > 0);

    }


    public static void main(String[] args) {

        Integer[] arr =  {8,6,2,1,5,7,4,3};
        sort(arr);

        System.out.println("-------------------------");
        for (int n=0; n<arr.length; n++){
            System.out.print(arr[n]+" ");
        }
        System.out.println(" ");
    }
}
