//Write a Java program to illustrate the uses of Static Block and try to explore with the ordering of the Static block inside the class and the respective results when it gets executed from main .


class DemoClass{
    int x;
    static int y;
    {
        System.out.println("----------Instance Block 2 is Running--------------");
        x = 23;
        y = 46;
    }

    {
        System.out.println("----------Instance Block 1 is Running--------------");
        x = 23;
        y = 46;
    }

    
    static{
        System.out.println("-----------1st Static Block is Running-------------");
        //  x = 12;       //Cannot make a static reference to the non-static field x
        y = 2;
    }
    
    static{
        System.out.println("-----------2nd Static Block is Running-------------");
        y = 4;
    }

    DemoClass(){
        System.out.println("Constructor is Call");
    }
}

public class StaticInitializerBlock {
    public static void main(String[] args) {
        DemoClass d1 = new DemoClass();

        System.out.println("The Value of Instance Variable is " + d1.x + "\nThe value of Static Varaible is " + DemoClass.y);
    }
}
