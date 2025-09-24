package _17_Threading;

/*
    🧠 Problem:
    Without synchronization, multiple threads print "We are learning" first,
    then each prints "MultiThreading.." afterward — leading to jumbled output.

    🎯 Goal:
    Ensure each thread prints "We are learning MultiThreading.." as a unified message,
    without interleaving with other threads.

    ✅ Solution:
    Use synchronization to make threads execute this critical section one at a time.
*/

public class _08_Synchronization {
    public static void main(String[] args) throws Exception {
        // Creating three threads of the same class
        S1 s1 = new S1();
        S1 s2 = new S1();
        S1 s3 = new S1();

        // Starting each thread
        s1.start();
        s2.start();
        s3.start();
    }
}

class S1 extends Thread {
    public void run() {
        // Synchronizing on the S1 class to ensure only one thread executes this block at a time
        synchronized (S1.class) {
            System.out.print("We are learning ");
            try {
                // Introducing delay to simulate work and expose thread interleaving
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Exception occurred: " + e);
            }
            // Completing the message after sleep
            System.out.println("MultiThreading..");
        }
    }
}