package multiThreadingUsingSyncronizedBlock.joinAndSyncronizedDemo;

//java.lang.Thread class provides the join() method which allows one thread to wait until another thread completes
// its execution. If t is a Thread object whose thread is currently executing, then t.join() will make sure that t is
// terminated before the next instruction is executed by the progra
    // Creating thread by creating the
// objects of that class

class Sender
{
    public void send(String msg)
    {
        System.out.println("Sending\t"  + msg );
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread  interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}
    class ThreadJoining extends Thread
    {
        Sender sender;
        String msg;
        ThreadJoining(String msg , Sender sender){
            this.msg=msg;
            this.sender = sender;
        }
        @Override
        public void run()
        {
//            for (int i = 0; i < 2; i++)
//            {
//                try
//                {
//                    Thread.sleep(500);
//                    System.out.println("Current Thread: "
//                            + Thread.currentThread().getName());
//                }
//
//                catch(Exception ex)
//                {
//                    System.out.println("Exception has" +
//                            " been caught" + ex);
//                }
//                System.out.println(i);
//            }
            synchronized(sender)
            {
                // synchronizing the send object
                sender.send(msg);
            }
        }
    }

   public class JoinSyncronizedDemo
    {
        public static void main (String[] args) {

            // creating two threads
//            ThreadJoining t1 = new ThreadJoining();
//            ThreadJoining t2 = new ThreadJoining();
//            ThreadJoining t3 = new ThreadJoining();
//
//            // thread t1 starts
//            t1.start();
//
//            // starts second thread after when
//            // first thread t1 has died.
//            try
//            {
//                System.out.println("Current Thread: "
//                        + Thread.currentThread().getName());
//                t1.join();
//            }
//
//            catch(Exception ex)
//            {
//                System.out.println("Exception has " +
//                        "been caught" + ex);
//            }
//
//            // t2 starts
//            t2.start();
//
//            // starts t3 after when thread t2 has died.
//            try
//            {
//                System.out.println("Current Thread: "
//                        + Thread.currentThread().getName());
//                t2.join();
//            }
//
//            catch(Exception ex)
//            {
//                System.out.println("Exception has been" +
//                        " caught" + ex);
//            }
//
//            t3.start();
            Sender sender = new Sender();
            ThreadJoining threadJoining = new ThreadJoining("hi" , sender);
            ThreadJoining threadJoining1 = new ThreadJoining("bye", sender);
            threadJoining.start();
            threadJoining1.start();
            // wait for threads to end
            try
            {
                threadJoining.join();
                threadJoining1.join();
            }
            catch(Exception e)
            {
                System.out.println("Interrupted");
            }
        }

}
