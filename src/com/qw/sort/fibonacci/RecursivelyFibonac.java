package com.qw.sort.fibonacci;

import com.qw.sort.util.FibonacTestHelper;

/**
 * 斐波那契数列
 * F(n)=F(n-1)+F(n-2)
 * */
public class RecursivelyFibonac {


    /**
     * 递归方式实现
     *  缺点： 有数据计算了两次，冗余
     * */
    public static long sum(int n){

        if (n == 0){
            return 0 ;
        }
        if (n == 1){
            return 1 ;
        }
        return  sum(n-1)+sum(n-2);
    }

    public static void main(String[] args) {

       // FibonacTestHelper.testSum("com.qw.sort.fibonacci.RecursivelyFibonac",3);
        //FibonacTestHelper.testSum("com.qw.sort.fibonacci.ArrayFibonac",30);
        //FibonacTestHelper.testSum("com.qw.sort.fibonacci.RecursiveFibonac",50);

    }

}
