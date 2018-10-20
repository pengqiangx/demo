package com.github.pengqiangx.demo.concurrency;

/**
 * @author xiaoniu 2018/7/3.
 */
public class SeqCount {

    private static ThreadLocal<A> seqCount = new ThreadLocal<A>(){
        @Override
        protected A initialValue() {
            A a = new A("张三",28);
            return  a;
        }
    };

    public A nextSeq() {
        seqCount.get().setAge(seqCount.get().age+1);
        seqCount.get().setName(seqCount.get().name+":p:");
        return seqCount.get();
    }

    public static void main(String[] args) {
        SeqCount seqCount = new SeqCount();
        SeqThread t1 = new SeqThread(seqCount);
        SeqThread t2 = new SeqThread(seqCount);
        SeqThread t3 = new SeqThread(seqCount);
        SeqThread t4 = new SeqThread(seqCount);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    private static class SeqThread extends Thread {

        private SeqCount seqCount;

        SeqThread(SeqCount seqCount){
            this.seqCount = seqCount;
        }

        @Override
        public void run() {
             for (int i =0 ; i < 3 ; i ++ ){
                 System.out.println(Thread.currentThread().getName() + " seqCount:"+ seqCount.nextSeq() );
             }
        }
    }
    static class A {
        private String name;
        private int age;

        public A(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "A{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
