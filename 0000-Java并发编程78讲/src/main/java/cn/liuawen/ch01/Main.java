package cn.liuawen.ch01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-24
 */
public class Main {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        //提交任务，并用 Future提交返回结果
        Future<Integer> future = service.submit(new CallableTask());
    }
}
