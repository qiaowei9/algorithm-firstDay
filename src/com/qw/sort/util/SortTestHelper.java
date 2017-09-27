package com.qw.sort.util;

public class SortTestHelper {

//   生成有n个元素的随机数组，
    public static Integer[] generateRandomArray(int n, int rangeL, int rangeR){

        assert rangeL <= rangeR;

        Integer[] arr = new Integer[n];
        for (int i=0; i<n; i++){
//            random 生成大于0 小于1 的随机数
            arr[i] =  new Integer((int) (Math.random()*(rangeR - rangeL) + rangeL));
        }
        return  arr;
    }

    public static void main(String[] args) {
        Integer[] arr = SortTestHelper.generateRandomArray(10,2,20);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
