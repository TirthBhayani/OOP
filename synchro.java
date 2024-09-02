public class synchro {
    public static void main(String[] args) throws InterruptedException {
        // Create a shared Integer wrapper object to hold the sum
        IntegerWrapper sum = new IntegerWrapper(0);
        int numThreads = 10;

        // Create and start threads
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    sum.increment();
                }
            });
            threads[i].start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            thread.join();
        }

        // Print the final sum
        System.out.println("Sum (without synchronization): " + sum.getValue());
    }

    // Integer wrapper class to allow shared mutable state
    static class IntegerWrapper {
        private Integer value;

        public IntegerWrapper(Integer initialValue) {
            this.value = initialValue;
        }

        public void increment() {
            value++;
        }

        public Integer getValue() {
            return value;
        }
    }
}
