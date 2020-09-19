package cn.liuawen.single;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-19
 * 饿汉式太着急了
 * 懒汉式来来
 * 懒汉式：
 *  延迟创建这个对象
 * (1)构造器私有化
 * (2)用一个静态变量来保存这个实例
 * (3)提供一个静态方法,获取这个实例对象
 */
public class Singleton4 {
    //public private public可能调用返回一个空的没有创建 类名.静态的
    private static Singleton4 instance;
    private Singleton4(){

    }
    //单线程
    public static Singleton4 getInstance(){
        if (instance == null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Singleton4();
        }
        return instance;
    }
}
