package threadvsRunnable;

public class ThreadingThreadDemo  extends Thread {
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running at: " + System.currentTimeMillis());
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }

}
