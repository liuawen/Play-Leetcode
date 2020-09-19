package cn.liuawen.test;

import cn.liuawen.single.Singleton4;

import java.util.concurrent.*;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-19
 */
public class TestSingleton4 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
/*
        Singleton4 s1 = Singleton4.getInstance();
        Singleton4 s2 = Singleton4.getInstance();
        System.out.println(s1 == s2);//true
        System.out.println(s1);//cn.liuawen.single.Singleton4@1b6d3586
        System.out.println(s2);//cn.liuawen.single.Singleton4@1b6d3586
*/
        Callable<Singleton4> c = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton4> f1 = es.submit(c);//把任务提交过去
        Future<Singleton4> f2 = es.submit(c);//把任务提交过去

        //执行了两遍
        Singleton4 s1 = f1.get();
        Singleton4 s2 = f2.get();

        System.out.println(s1 == s2);//true
        System.out.println(s1);//cn.liuawen.single.Singleton4@1b6d3586
        System.out.println(s2);
        //可能false
        //暂停一下 都来new了 线程切换  线程安全问题 概率
        es.shutdown();
    }
}
