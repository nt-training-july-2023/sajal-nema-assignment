//Write a Java program to showcase the concept of Static Class and try to explore what happens when using a static class, we want to access other non-static members of the Outer-Class.

//static class Outer{} // Illegal modifier for the class Outer; only public, abstract & final are permitted

class Outer{
    public String str = "Hello";
    public static String str2 = "Hey!";

    public static class InnerStatic{
        public void ChangeStr(){
            //str = "MyName";     //Error : Cannot make a static reference to the non-static field str
            str2 = "What's Up!";
            System.out.println(str2);
        }
    }
}

public class StaticClass {
    public static void main(String[] args) {
        Outer o1 = new Outer();

        System.out.println("The value of str is " + o1.str);
        System.out.println("The value of str2 is " + Outer.str2);

        Outer.InnerStatic staticObj = new Outer.InnerStatic();
        staticObj.ChangeStr();

        System.out.println("-------------------After Static Method is Call then the value of str and str2 is --------------------");
        System.out.println("The value of str is " + o1.str);
        System.out.println("The value of str2 is " + Outer.str2);
    }
}
