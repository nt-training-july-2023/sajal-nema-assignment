final class SuperClass{
    int x = 12;
    void fun(){
        System.out.println("Super Class");
    }
}

//class SubClass extends SuperClass{}         //The type SubClass cannot subclass the final class SuperClass

public class FinalClass {
    public static void main(String[] args) {
        SuperClass s1 = new SuperClass();
        s1.fun();
        System.out.println("In case of Final Class , the child or subclass may not have the right to extend or inherit the base or Super class");
    }
}
