class ParentClass{
    void show(){
        System.out.println("This is a Parent Class");
    }

    final void display(){
        System.out.println("Parent Class Display");
    }
}

class ChildClass extends ParentClass{
    @Override
    void show(){
        System.out.println("This is a Child Class");
    }

   /* void display(){                 //Cannot override the final method from ParentClassJava
        System.out.println("Child Class Display");
    } 
   */
}

public class FinalMethod {
    public static void main(String[] args) {
        ParentClass p1 = new ChildClass();
        p1.show();
    }
}
