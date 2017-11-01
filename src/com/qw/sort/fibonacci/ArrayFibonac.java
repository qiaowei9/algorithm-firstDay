package com.qw.sort.fibonacci;

/**
 * 数组方式实现斐波那契数列
 * */
public class ArrayFibonac {


    public static long sum(int n){

        long[] arr = new long[n];
        for (int i=0; i < n; i++){
            if ( i == 0){
                arr[i] = 0;
            }else if ( i == 1){
                arr[i] = 1;
            }else{
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
       /* for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }*/
        System.out.println("计算结果："+arr[n-1]);
        return arr[n-1];

    }
}
