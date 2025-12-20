void main() {
    // Threading = Allows a program to run multiple tasks simultaneously
    // Helps improve performance with time-consuming operations
    // Useful for background tasks or time-consuming operations

    // Ways to Create Thread

    // Option 1. Extend the Thread class (simpler)
    MyThread myThread = new MyThread();
    myThread.setDaemon(true); // Forces thread to stop when main thread ends
    myThread.start(); // Begins thread execution

    // Option 2. Implement the Runnable interface (better)
    Runnable myRunnable = new MyRunnable();
    Thread newThread = new Thread(myRunnable);
    newThread.setDaemon(true);
    newThread.start();

    // Multithreading - Enables a program to run multiple threads concurrently
    // Thread - A set of instructions that run independently
    Thread worldGeneration = new Thread(new Generation("Preparing world spawn"));
    Thread mobGeneration = new Thread(new Generation("Generating animals and monsters"));

    IO.println("Creating new world");
    worldGeneration.start();
    mobGeneration.start();

    try {
        // Waits for another thread to finish before continuing
        worldGeneration.join();
        mobGeneration.join();
    }
    catch (InterruptedException e) {
        System.out.println("Error: Main thread was interrupted.");
    }

    System.out.println("World generation completed!");
}

// 'MyThread' inherits 'Thread' class to override 'run' method which is called with 'start'
// Simpler but limited since it is locked to inherit 'Thread' class
class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            try{
                IO.println(i);
                Thread.sleep(1000); // Pauses thread for milliseconds
            }
            catch(InterruptedException e){
                IO.println("Error: Thread 'MyThread' was interrupted.");
            }
        }
        IO.println("Happy 4th of July!");
    }
}

// 'MyRunnable' implements 'Runnable' to override 'run' method but requires to be passed to 'Thread' object to start
// More complex but not limited to inheriting 'Thread' class
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 10; i >= 1; i--){
            try {
                IO.println(i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                IO.println("Error: Thread 'MyRunnable' was interrupted.");
            }
        }
        IO.println("Happy Stranger Things Day!");
    }
}

class Generation implements Runnable {

    String text;

    Generation(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i+=10) {
            System.out.printf("[%s] %s: %d%%\n", Thread.currentThread().getName(), text, i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                IO.println("Error: Thread sleep was interrupted.");
            }
        }
        System.out.printf("\n[%s] %s completed!\n", Thread.currentThread().getName(), text);
    }
}
