package Basic;

public class stringBuffers {
    public static void stringBufferSync() {
        StringBuffer string = new StringBuffer();

        // Create a lock object for synchronization
        Object lock = new Object();

        // Thread 1: Appends "A" 1000 times
        Thread thread1 = new Thread(() -> {
            synchronized (lock) { // Lock for Thread 1
                for (int i = 0; i < 1000; i++) {
                    string.append("A");
                }
            }
        });

        // Thread 2: Appends "B" 1000 times
        Thread thread2 = new Thread(() -> {
            synchronized (lock) { // Lock for Thread 2
                for (int i = 0; i < 1000; i++) {
                    string.append("B");
                }
            }
        });
        // Start both threads
        thread1.start();

        // Ensure Thread 1 completes before Thread 2 starts
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();

        // Wait for Thread 2 to complete
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the result
        System.out.println("Result: " + string.toString());

    }

    public static void main(String[] args) {
        stringBufferSync();

    }

}
