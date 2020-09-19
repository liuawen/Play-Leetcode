package cn.liuawen.single;

import java.io.IOException;
import java.util.Properties;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-09-19
 * 复杂版本
 * 静态代码块来new
 * 类的加载和初始化  执行
 * 什么情况使用
 */
public class Singleton3 {
    //    public static final Singleton3 INSTANCE = new Singleton3();
    public static final Singleton3 INSTANCE;
    private String info;

    //配置文件配置信息  从文件里面来读取
    //适合读一堆的初始化数据
    static {
        //src下 类加载路径
        try {
            Properties pro = new Properties();
            pro.load(Singleton3.class.getClassLoader().getResourceAsStream("single.properties"));
            INSTANCE = new Singleton3(pro.getProperty("info"));
        } catch (IOException e) {
//            e.printStackTrace();
            throw new RuntimeException(e);
        }
//        INSTANCE = new Singleton3("渐若窥宏大");
    }


    private Singleton3(String info) {
        this.info = info;
    }

    public static Singleton3 getINSTANCE() {
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "info='" + info + '\'' +
                '}';
    }

}
