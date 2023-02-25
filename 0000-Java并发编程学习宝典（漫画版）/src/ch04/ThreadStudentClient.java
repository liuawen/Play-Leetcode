package ch04;


import ch03.Student;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2023-02-04
 */
public class ThreadStudentClient {
    public static void main(String[] args) {
//        Punishment punishment = new Punishment(100,"internationalization");
        Punishment punishment = new Punishment(100000,"internationalization");

        ThreadStudent xiaoming = new ThreadStudent("小明",punishment);
        xiaoming.start();

        ThreadStudent xiaozhang = new ThreadStudent("小张",punishment);
        xiaozhang.start();

        ThreadStudent xiaozhao = new ThreadStudent("小赵",punishment);
        xiaozhao.start();
    }
}
