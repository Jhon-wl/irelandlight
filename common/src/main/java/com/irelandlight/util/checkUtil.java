package com.irelandlight.util;

import org.testng.annotations.Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by mr.w on 2017/2/16.
 */


public class checkUtil{

    /*
    * 将byte数组转化为16进制输出
    * @Param bytes
    * @return
    * */
    public static String convertByteToHexString(byte[] bytes){
        String result = "";
        for(int i=0;i<bytes.length;i++){
            int temp = bytes[i] & 0Xff;
            String tempHex = Integer.toHexString(temp);
            if(tempHex.length()<2){
                result +="0"+tempHex;
            }else{
                result += tempHex;
            }
        }
        return result;
    }

    /*
    * jdk自带的MD5加密算法
    * @Param message
    * @return
    * */
    public static String md5Jdk(String message){
        String temp = "";
        try {
            MessageDigest md5Digest = MessageDigest.getInstance("MD5");
            byte[] encodeMd5Digest = md5Digest.digest(message.getBytes());
            temp = convertByteToHexString(encodeMd5Digest);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return temp;
    }
    @Test
    public void test(){
        String md5Encode = md5Jdk("");
        System.out.println("MD5JDK加密后："+md5Encode);
        System.out.println("MD5JDK加密后长度为："+md5Encode.length());




    }

}
