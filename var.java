public class AllVariables {

    int a = 10;          // instance variable
    static int b = 20;   // static variable

    public void display() {
        int c = 30;      // local variable
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        AllVariables obj = new AllVariables();
        obj.display();
    }
}
