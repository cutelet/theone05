package com.itheima.test02;

public class testequals {
    public static void main(String[] args) {
        test t1 = new test("zhangsan",23);
        test t2 = new test("zhangsan",23);

        System.out.println(t1 == t2);

        System.out.println(t1.equals(t2));
    }
}
