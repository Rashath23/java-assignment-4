class Assignment15 extends Thread {

    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } 
        catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted");
        }
    }

    public static void main(String[] args) {

        Assignment15 t = new Assignment15();
        t.start();
    }
}
