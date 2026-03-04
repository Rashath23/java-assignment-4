class Assignment15 {

    synchronized void display() {
        try {
            for(int i = 1; i <= 3; i++) {
                System.out.println("Synchronized Block: " + i);
                Thread.sleep(1000); // Sleep inside synchronized method
            }
        } 
        catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }

    public static void main(String[] args) {

        Assignment15 obj = new Assignment15();

        Thread t1 = new Thread(() -> obj.display());
        Thread t2 = new Thread(() -> obj.display());

        t1.start();
        t2.start();
    }
}
