package _17_Threading;
/*
        Life cycle of thread
       +----------------------+
       |      New             |
       |  (Thread Created)    |                         ( Start() )
       +----------+-----------+
                  |
                  v
         +--------+--------+
         |      Runnable    |<-----------------------+
         +--------+--------+                         |
                  |                                  |
        JVM selects thread                           |
                  v                                  |
         +--------+--------+                         |
         |      Running     |                        |
         +--------+--------+                         |
            /           \                            |
           /             \                           |  ( sleep, wait() --> notify() , suspend() --> resume() )
     +----+--+       +----+------------+             |
     |Blocked|       | Waiting / Timed |             |
     +----+--+       |    Waiting      |             |
          \          +-----------------+             |
           \                  |                      |
            \---------------->+                      |
                              v                      |
                       +------+----------+           |
                       |   Terminated    |<----------+   ( if you want to kill the thread forcely then  stop() )
                       +-----------------+

     Legend:
- New: Thread is created but not started.
- Runnable: Ready for execution.
- Running: Actively executing.
- Blocked: Waiting to access a locked resource.
- Waiting: Waiting indefinitely for another thread.
- Timed Waiting: Paused for a set time (sleep(), join()).
- Terminated: Thread completes or crashes.


To create Thread class , we have 2 way
        1) extends Thread
        2) implements Runnable
*/
// using extends Thread
public class _02_Multithreading {
    public static void main(String[] args) {
        AA aa = new AA();
        BB bb = new BB();
        CC cc = new CC();

        aa.start();
        bb.start();
        cc.start();
        // output is random because all class executing parallel
    }
}
class AA extends Thread {
    public void run(){
        for (int i=1 ; i<=5 ; i++){
            try{
                if (i == 4){
                    Thread.sleep(3000);
                }
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("AA = "+i);
        }
    }
}
class BB extends Thread {
    public void run(){
        for (int i=5 ; i<=10 ; i++) System.out.println("BB = "+i);
    }
}
class CC extends Thread {
    public void run(){
        for (int i=11 ; i<=15 ; i++) System.out.println("CC = "+i);
    }
}
