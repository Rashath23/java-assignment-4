class Assignment15 {
    public static void main(String[] args) {

        System.out.println("Program Started...");

        try {
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        } 
        catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Program Resumed after 3 seconds.");
    }
}
