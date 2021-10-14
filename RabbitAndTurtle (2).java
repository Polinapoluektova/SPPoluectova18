package src;

public class a {
    public static void main(String[] args) throws InterruptedException {
        EggOrChicken age = new EggOrChicken("age", 3);
        age.start();
        EggOrChicken chicken = new EggOrChicken("chicken", 5);
        chicken.start();

        String win;
        while (true) {
            if (chicken.isAlive() == false && age.isAlive() == true) {
                win = "выйграло яйцо";
                break;
            }
            if ((chicken.isAlive() == true) && (age.isAlive() == false)) {
                win = "выйграла курица";
                break;
            }
        }
        chicken.join();
        age.join();
        System.out.println(win);
    }

    static class EggOrChicken implements Runnable {
        Thread thread;
        int priority;
        final private String who;

        EggOrChicken(String name, int priorityThread) {
            who = name;
            priority = priorityThread;
        }

        @Override
        public void run() {
            System.out.println("Thread running" + who);
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                System.out.println(who);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted");
                }
            }
        }

        public void start() {
            System.out.println("Thread started");
            if (thread == null) {
                thread = new Thread(this, who);
                thread.start();
            }
        }

        public boolean isAlive() {
            return false;
        }
        public void join() {
        }
    }
}
