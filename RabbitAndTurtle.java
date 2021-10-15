package src;

public class RabbitAndTurtle {
    public class AnimalThread extends Thread {
        String name;
        int priority;
        public AnimalThread(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }
        public void main(String[] args) throws InterruptedException {
            AnimalThread Rabbit = new AnimalThread("rabbit:", 1);
            Rabbit.start();
            AnimalThread Turtle = new AnimalThread("turtle:", 3);
            Turtle.start();
        }
        @Override
        public void run() {
            System.out.println("Thread running" + name);
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
                System.out.println(name);
            }
        }
    }
}