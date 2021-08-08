package com.example.lwhdemo.test.jvmTest;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class HeapTest {

    private static final int SIZE =1024*1024*20;//20MB
    public static void main(String[] args)  {
//        long start = System.currentTimeMillis();
//        for(int i = 0;i<1000000;i++){
//            createUser();
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end-start + "s");
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        createUser();
    }

    private  static void createUser(){
        List<ByteBuffer> bufferList= new ArrayList<ByteBuffer>();
        int count =0;
        while(true){
            ByteBuffer buffer = ByteBuffer.allocateDirect(SIZE);
            bufferList.add(buffer);
            count++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println(count);
            }
        }

    }

    static class User{

    }
}
