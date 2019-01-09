package thread;

public class ThreadDemo implements Runnable {

    private Thread thread;
    private String threadName;

    public ThreadDemo(String name) {
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        try {
            System.out.println("Running " + threadName);
            for (int i = 0; i < 4; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + "interrupted.");
        }
        System.out.println("Thread " + threadName + " existing.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}

class TestThread2 {
   public static void main(String args[]) {
       RunnableDemo R1 = new RunnableDemo( "Thread-1");
       R1.start();
       RunnableDemo R2 = new RunnableDemo( "Thread-2");
       R2.start();
   }
}
