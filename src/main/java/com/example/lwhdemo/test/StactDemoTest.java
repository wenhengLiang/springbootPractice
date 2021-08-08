package com.example.lwhdemo.test;

public class StactDemoTest {
    public static void main(String[] args) {
        long memory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        System.out.println(memory);
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        StactDemoTest test = new StactDemoTest();
//        test.test1();
//        int a =123;
    }
    private void test1(){
        System.out.println("hello test1");
    }

    public void test2(){
        int a =10;
        int m= a++;
        int b =10;
        int n = ++b;
    }

}
