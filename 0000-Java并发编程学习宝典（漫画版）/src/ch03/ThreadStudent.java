package ch03;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-24
 */
//1、继承Thread类  重写run()方法
public class ThreadStudent extends  Thread {
        private String name;
        private Punishment punishment;

        public ThreadStudent(String name, Punishment punishment) {
            //2、调用Thread构造方法，设置threadName
            super(name);
            //继承Thread类
            this.name=name;
            this.punishment = punishment;
        }

        public void copyWord() {
            int count = 0;
            String threadName = Thread.currentThread().getName();

            while (true) {
                if (punishment.getLeftCopyCount() > 0) {
                    int leftCopyCount = punishment.getLeftCopyCount();
                    System.out.println(threadName+"线程-"+name + "抄写" + punishment.getWordToCopy() + "。还要抄写" + --leftCopyCount + "次");
                    punishment.setLeftCopyCount(leftCopyCount);
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(threadName+"线程-"+name + "一共抄写了" + count + "次！");
        }
        //3、重写run方法，调用copyWord完成任务
        @Override
        public void run(){
            copyWord();
        }
}
