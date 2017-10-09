package com.qw.sort.util;

import com.qw.sort.selection.SelectionSort;
import com.qw.sort.selection.comparable.SelectionSortUseComparable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
    //数组交换位置
    public static void swap(Object[] arr, int i, int j){
        Object temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*
    * 测试sortClassName对应的排序算法排序arr数组得到结果正确性和算法运行时间
    *sortClassName: 排序算法名称
    * arr：进行排序的数组
    * */
    public static void testSort(String sortClassName, Comparable[] arr){

        try {
            //通过sortClassName获得排序函数的Class对象
            Class sortClass = Class.forName(sortClassName);
            //通过排序函数的Class对象获得排序方法
            Method sortMethod = sortClass.getMethod("sort",new Class[]{Comparable[].class});
            //排序参数 只有一个  进行比较的 数组 arr
            Object[] params =  new Object[]{arr};

            long startTime = System.currentTimeMillis();
            //调用排序函数
            sortMethod.invoke(null,params);
            long endTime = System.currentTimeMillis();
            assert  isSorted(arr);
            System.out.println(sortClass.getSimpleName()+" : " + (endTime - startTime) + "ms");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }



    public static void main(String[] args) {
        Integer[] arr = generateRandomArray(1000, 5,200);
        SelectionSortUseComparable.sort(arr);
        testSort("com.qw.sort.selection.comparable.SelectionSortUseComparable",arr);

    }
}
