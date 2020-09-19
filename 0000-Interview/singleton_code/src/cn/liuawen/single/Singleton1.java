package cn.liuawen.single;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-19
 * 饿汉式
 *  直接创建对象 不管你是否需要这个对象
 * (1)构造器私有化
 * (2)自行创建 并用静态变量保存
 * (3)向外提供这个实例 可以类.变量
 * (4)强调这是一个单例 我们可以用fina修饰
 *
 */
public class Singleton1 {
//    static Singleton1 instance = new Singleton1();
    public static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){

    }
    //我用这个类 是不需要这个对象的  不管我是否需要这个对象   静态 是会创建出来的
    public static void test () {

    }
}
