package com.qw.sort.fibonacci;

/**
 * 递推方式实现斐波那契数列
 * */
public class RecursiveFibonac {

    public static long sum(int n){

        long a =0, b=1,c=0;
        for (int i=0; i< n; i++){

            if ( i == 0){
                c = 0;
            }else if ( i == 1){
                c = b;
            }else {
                c=a+b;
                a = b;
                b = c;
            }
           // System.out.print(c+",");
        }
        System.out.println("计算结果："+c);
        return c;

    }
}
