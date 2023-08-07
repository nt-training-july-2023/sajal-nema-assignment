//Write a Java program to show the various ways of initializing a final blank variable . ( like a- constructor and other ways ).


class FinalClassDemo{
    public final int y;
    public static final int x;
    
    //Using Constructor
    public FinalClassDemo(){
        // y = 23;
    }

    {
        y = 50;
    }

    static{
        x = 100;
    }


}

public class FinalVariableIIntialization {
    public static void main(String[] args) {
        FinalClassDemo d1 = new FinalClassDemo();
        System.out.println(d1.y);
        System.out.println(FinalClassDemo.x);
    }
}
