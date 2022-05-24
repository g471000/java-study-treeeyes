package ch13;

public class ThreadEx09 {
    public static void main(String[] args) {
        ThreadGroup main = Thread.currentThread().getThreadGroup();
        ThreadGroup tg1 = new ThreadGroup("Group 1");
        ThreadGroup tg2 = new ThreadGroup("Group 2");

        ThreadGroup subTg1 = new ThreadGroup(tg1, "SubGroup 1");

        tg1.setMaxPriority(3);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        };

        new Thread(tg1, r, "th1").start();
        new Thread(subTg1, r, "th2").start();
        new Thread(tg2, r, "th3").start();

        System.out.println(">> List of ThreadGroup : " + main.getName());
        System.out.println("Active ThreadGroup: " + main.activeGroupCount());
        System.out.println("Active Thread: " + main.activeCount());

        main.list();
    }
}
