public class StaticVsInstance {

    int instanceVar = 10;     // instance variable
    static int staticVar = 20; // static variable

    public static void main(String[] args) {

        StaticVsInstance obj1 = new StaticVsInstance();
        StaticVsInstance obj2 = new StaticVsInstance();

        obj1.instanceVar = 30;

        System.out.println(obj1.instanceVar); // 30
        System.out.println(obj2.instanceVar); // 10
        System.out.println(staticVar);         // 20
    }
}
