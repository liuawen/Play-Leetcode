package ch05;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2023-02-04
 */
public class RunnableStudentClient {
    public static void main(String[] args) {
        Punishment punishment = new Punishment(100,"internationalization");
//        Thread xiaoming = new Thread(new RunnableStudent("小明",punishment),"小明");
        Thread xiaoming = new Thread(new RunnableStudent("小明",punishment),"小明");
        xiaoming.start();
    }
}
