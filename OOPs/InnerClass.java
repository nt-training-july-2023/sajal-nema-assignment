class OuterClass{
    //Instance Inner Class
    int x = 34;
    static int y = 50;


    //Inner Class can be of Private , Protected , Public or Default
    public class Inner{
        void if1(){
            System.out.println("Inner Class");
            System.out.println(x); 
            System.out.println(y);
        }
    }

    public static class StaticInner{
        void sf1(){
            System.out.println("Static Inner Class");
            //System.out.println(x);      //Error:Static Class can access only Static members of Outer Class
            System.out.println(y);
        }
    }

    private class PrivateInner{
        void if2(){
            System.out.println("Private Inner Class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        //For Instance Inner Class
        OuterClass obj = new OuterClass();
        //Create a reference of Inner Class in Case of Instance Inner Class
        OuterClass.Inner innerObj = obj.new Inner();
        innerObj.if1();


        //For Static Inner Class
        OuterClass.StaticInner staticObj = new OuterClass.StaticInner();
        staticObj.sf1();


        //Private Instance Inner CLass
        //OuterClass.PrivateInner = obj.new PrivateInner();   // Error:The type OuterClass.PrivateInner is not visible
    }
}
