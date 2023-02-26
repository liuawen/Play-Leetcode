package cn.liuawen.ch02;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @description
 * @create 2023-02-19
 */
public class TestProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue storage = new ArrayBlockingQueue(8);

        Producer producer = new Producer(storage);
        Thread producerThread = new Thread(producer);
        producerThread.start();
        Thread.sleep(500);

        Consumer consumer = new Consumer(storage);
        while (consumer.needMoreNums()) {
            System.out.println(consumer.storage.take() + "被消费了");
            Thread.sleep(100);
        }
        System.out.println("消费者不需要更多数据了。");

        //一旦消费不需要更多数据了，我们应该让生产者也停下来，但是实际情况却停不下来
        producer.canceled = true;
        System.out.println(producer.canceled);
        consumer.storage.take();
//        producerThread.interrupt();
        /**
         * 生产者结束运行
         * java.lang.InterruptedException
         * 	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.reportInterruptAfterWait(AbstractQueuedSynchronizer.java:2014)
         * 	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2048)
         * 	at java.util.concurrent.ArrayBlockingQueue.put(ArrayBlockingQueue.java:353)
         * 	at cn.liuawen.ch02.Producer.run(Producer.java:24)
         * 	at java.lang.Thread.run(Thread.java:748)
         */
    }
}
