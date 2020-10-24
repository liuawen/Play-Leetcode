package ch03;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-24
 */
public class RunnableStudentClient {
    public static void main(String[] args) {
        Punishment punishment = new Punishment(100,"internationalization");
        Thread xiaoming = new Thread(new RunnableStudent("小明",punishment),"小明");
        xiaoming.start();
    }
}
