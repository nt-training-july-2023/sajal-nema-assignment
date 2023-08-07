//Task : Write a Java program to override a method of an Anonymous Inner class multiple times and Explore the scenarios.
//Anonymous Class : 
//1. It can be a inner class .
//2. It is a subclass of any class.

class Greeting{
    void Greet(){
        System.out.println("Parent Class of Anonymous Class");
    }

    void GreetHello(){
        System.out.println("Parent Class GreetHello");
    }
}

class Outer{
    Greeting g = new Greeting(){
        @Override
        public void Greet(){        //Override  Parent Class
            System.out.println("From Anonymous Class");
        }

        public void Greet2(){
            System.out.println("Class Greet2 from Anonymous");
        }
    };
}

 
public class AnonymousClass {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        o1.g.Greet();
        //To achieve the below scenario we also create a Greet2 in parent class and then override it in child class , because parent class object can access all methods of itself as well as override method in subclass only.
        //o1.g.Greet2();  //Error : The method Greet2() is undefined for the type Greeting

        Greeting g1 = new Greeting();
        g1.Greet();
        g1.GreetHello();
    }
}
