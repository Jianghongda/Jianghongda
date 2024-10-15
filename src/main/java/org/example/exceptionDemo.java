package org.example;

import java.io.IOException;

/**
 * @author hongda
 * @date 2024/10/14 18:15
 */
public class exceptionDemo {
    public static void main(String args[]){
    int num = count(1, 2);
    System.out.println(num);
    }

    public static int count(int j, int k) {
        try {
            return j / k;
        } catch (NullPointerException e) {
            System.err.println("计算逻辑中出现了异常");
        }catch (Exception e) {
            System.err.println("计算逻辑中出现了异常");
        }finally {
            return -1;
        }
    }
    /*
    * 空指针异常（NullPointerException）
    * 类型转换异常（ClassCastException）
    * 数组负下标异常（ArrayIndexOutOfBoundsException）
    * 数学异常（ArithmeticException）
    * 算术异常（IllegalArgumentException）
    * 违反安全原则异常（SecurityException）
    * 文件未找到异常（FileNotFoundException）
    * 栈溢出异常（StackOverflowError）
    * 字符串解析异常（NumberFormatException）
    * 运行时异常（RuntimeException）
    * */

}
