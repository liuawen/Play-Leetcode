package cn.liuawen.ch01;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-24
 */
public class CallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}
