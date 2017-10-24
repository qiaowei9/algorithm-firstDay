package com.qw.sort.test;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Test extends AbstractTest implements InterfaceTest{
        @Override
        public void open() {

        }

        @Override
        public void close() {

        }


    @Override
    void clam() {


    }


    static{

            c = 3;

    }
    private static int c;
    public static void main(String[] args) {

       /* ThreadTest test =  new ThreadTest();

          Thread t1 = new Thread(test,"售票员111");

          Thread t2 = new Thread(test,"售票员222");

          t1.start();
          t2.start();
         System.out.println("mainThread-----");*/
          /*  final FinalString fs = new FinalString("111");

            final FinalString fs2 = new FinalString("333");


            fs.setStr("222");
        System.out.println(fs.getStr());*/
        try {
            String aa = Test.EncoderByMd5("Egis shield and spear Pallas");
            System.out.println(aa);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    public static String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5=MessageDigest.getInstance("MD5");
        String salt = "Egis shield and spear Pallas";
        md5.update(salt.getBytes());
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
        return newstr;
    }

}

