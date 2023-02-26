package cn.liuawen.ch04;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @description
 * @create 2023-02-19
 */
public class NewBlockingQueue {
    Queue<String> buffer = new LinkedList<String>();

    public void give(String data) {
        buffer.add(data);
        notify();  // Since someone may be waiting in take
    }

    public String take() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                wait();
            }
            return buffer.remove();
        }
    }
}
