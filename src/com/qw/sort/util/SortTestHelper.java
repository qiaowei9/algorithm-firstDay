package com.qw.sort.util;

import java.util.Random;

public class SortTestHelper {

    //生成有n个元素的随机数组，
    public static Integer[] generateRandomArray(int n, int rangeL, int rangeR){

        assert rangeL <= rangeR;

        Integer[] arr = new Integer[n];

        Random random = new Random();
        for (int i=0; i<n; i++){

            arr[i] = random.nextInt(n)%(rangeR-rangeL+1)+rangeL;
            //random 生成大于0 小于1 的随机数
//            arr[i] =  new Integer((int) (Math.random()*(rangeR - rangeL+1) + rangeL));
        }
        return  arr;
    }

    //打印数组所有内容
    public static void printArray(Object[] arr){

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    //判断数组是否有序
    public static boolean isSorted(Comparable[] arr){

        for (int i=0; i<arr.length-1; i++){
            if (arr[i].compareTo(arr[i-1])>0){
                return false;
            }
        }
        return true;
    }

    //测试sortClassName对应的排序算法排序arr数组得到结果正确性和算法运行时间
    public static void testSort(String sortClassName, Comparable[] arr){


    }



    public static void main(String[] args) {
        Random random =  new Random();
        for (int i=1; i<=100; i++){
//            int r = new Integer((int) (Math.random()*(20 - 0) + 0));
            int r = random.nextInt(1000)%(20-0+1)+0;
            System.out.print(r+"  ");
            if (i % 10 == 0){
                System.out.println(" ");
            }
        }

        /*Integer[] arr = SortTestHelper.generateRandomArray(10,2,20);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }*/
    }
}
