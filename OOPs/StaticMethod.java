//Write a Java program to showcase the concept of Static Methods and try to explore the scenarios when a static method tries to access or changes the value or functionality of a non-static member ( like variable , method ).


class StaticMethodDemo{
    public int x;
    public static int y;
    static void fun(){
        // x = 23;      //Error : Cannot make a static reference to the non-static field x
        y = 32;
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        StaticMethodDemo obj = new StaticMethodDemo();
        StaticMethodDemo.fun();
        System.out.println("The value of Instance Variable x is " + obj.x);     //0
        System.out.println("The value of Static Variable y is " + StaticMethodDemo.y);      //32
        
    }
}
