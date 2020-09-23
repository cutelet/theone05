package com.itheima.test01;

public class testsystem {
    public static void main(String[] args) {
        System.out.println("11111111");
        System.out.println("中止前");
        System.exit(0);
        System.out.println("222222222222222");
        System.out.println("种植后");

        long l = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[10];
        System.arraycopy(arr1,0,arr2,0,0);
        System.out.println(arr2);
    }
}

