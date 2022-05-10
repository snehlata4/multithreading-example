package threadvsRunnable;

// Main Class
public class Multithread {
    public static void main(String[] args) throws InterruptedException {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            ThreadingThreadDemo object
                    = new ThreadingThreadDemo();
            object.start();
            Thread.sleep(100);
        }
    }
}
