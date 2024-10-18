public class Counter {
    private int count;

    
    public Counter() {
        this.count = 0;
    }

    
    public Counter(int initialCount) {
        if (initialCount < 0) {
            throw new IllegalArgumentException("Initial count cannot be negative.");
        }
        this.count = initialCount;
    }

   
    public void increment() {
        count++;
    }

    
    public void decrement() {
        count--;
    }

    
    public int getCount() {
        return count;
    }

    
    public static void main(String[] args) {
        try {
            Counter counter = new Counter(-10); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Counter validCounter = new Counter();
        validCounter.increment();
        System.out.println("Count: " + validCounter.getCount());
    }
}