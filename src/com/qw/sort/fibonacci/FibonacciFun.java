package com.qw.sort.fibonacci;

/**
 * 斐波那契数列
 * F(n)=F(n-1)+F(n-2)
 * */
public class FibonacciFun {


    /**
     * 递归方式实现
     *  缺点： 有数据计算了两次，冗余
     * */
    public static int Fibonac(int a){

        if (a == 0){
            return 0 ;
        }
        if (a == 1){
            return 1 ;
        }
        return  Fibonac(a-1)+Fibonac(a-2);
    }

    //递推方式实现
    public static int FibonacDiTui(int n){

        int a =0, b=1,c=0;
        for (int i=0; i< n; i++){

            if (n == 0){
                return  a;
            }
            if (n == 1){
                return b;
            }else {
                c=a+b;
                a = b;
                b = c;
            }
        }
        return c;

    }

    public static void main(String[] args) {

        int n = 2;
        int a = FibonacciFun.FibonacDiTui(n);
        System.out.println(a);

    }

}
