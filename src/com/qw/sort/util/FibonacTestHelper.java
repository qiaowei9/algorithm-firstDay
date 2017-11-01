package com.qw.sort.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FibonacTestHelper {

    public static void testSum(String className,int n){

        try {
           Class clzz = Class.forName(className);

           Method sumMethod = clzz.getMethod("sum",new Class[]{int.class});

           //开始时间
           long startTime = System.currentTimeMillis();

           sumMethod.invoke(null,n);

           long endTime = System.currentTimeMillis();

            System.out.println(clzz.getSimpleName()+":"+ (endTime - startTime) +"ms");

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

}
