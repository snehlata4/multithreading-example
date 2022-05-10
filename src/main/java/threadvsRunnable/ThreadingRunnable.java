package threadvsRunnable;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadingRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getId());
        }

        public static void main(String[] args) {
            ThreadingRunnable ex = new ThreadingRunnable();
            long start = System.currentTimeMillis();
            Thread t1= new Thread(ex);
            Thread t2 = new Thread(ex);
            t1.start();
            t2.start();
            long end = System.currentTimeMillis();
            log.info("time taken: " + (end-start));
        }
    }