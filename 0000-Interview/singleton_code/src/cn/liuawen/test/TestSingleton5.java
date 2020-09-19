package cn.liuawen.test;

import cn.liuawen.single.Singleton5;
import cn.liuawen.single.Singleton5;

import java.util.concurrent.*;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-19
 */
public class TestSingleton5 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
/*
        Singleton5 s1 = Singleton5.getInstance();
        Singleton5 s2 = Singleton5.getInstance();
        System.out.println(s1 == s2);//true
        System.out.println(s1);//cn.liuawen.single.Singleton5@1b6d3586
        System.out.println(s2);//cn.liuawen.single.Singleton5@1b6d3586
*/
        Callable<Singleton5> c = new Callable<Singleton5>() {
            @Override
            public Singleton5 call() throws Exception {
                return Singleton5.getInstance();
            }
        };
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton5> f1 = es.submit(c);//把任务提交过去
        Future<Singleton5> f2 = es.submit(c);//把任务提交过去

        //执行了两遍
        Singleton5 s1 = f1.get();
        Singleton5 s2 = f2.get();

        System.out.println(s1 == s2);//true
        System.out.println(s1);//cn.liuawen.single.Singleton5@1b6d3586
        System.out.println(s2);
        //可能false
        //暂停一下 都来new了 线程切换  线程安全问题 概率
        es.shutdown();
    }
}
