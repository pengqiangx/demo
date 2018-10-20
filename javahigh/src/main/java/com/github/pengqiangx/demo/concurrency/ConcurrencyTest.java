package com.github.pengqiangx.demo.concurrency;

import org.junit.Test;

/**
 * @author xiaoniu 2018/5/2.
 */
public class ConcurrencyTest {

    private static final long count = 10001;

    /**
     * 并发
     * @throws InterruptedException
     */
    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    int a = 0;
                    for(long i = 0; i<count ;i++){
                        a +=5;
                    }
                }
            }
        );
        thread.start();
        int b = 0;
        for(long i =0 ; i< count; i++){
            b--;
        }
        thread.join();//使调用线程 thread 在此之前执行完毕
        long time = System.currentTimeMillis() - start;
        System.out.println("concurrency={}"+time+"ms,b="+b);

    }

    /**
     * 串行
     */
    public void serial(){
        long start = System.currentTimeMillis();
        int a = 0;
        for(long i = 0; i<count ;i++){
            a +=5;
        }
        int b = 0;
        for(long i =0 ; i< count; i++){
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("serial={}"+time+"ms,b="+b);
    }

    @Test
    public void test1() throws InterruptedException {
        concurrency();
        serial();
    }

}
