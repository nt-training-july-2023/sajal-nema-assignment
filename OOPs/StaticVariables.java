class StaticVarDemoClass{
    public int instanceVar = 23;
    public static int staticVariable = 44;

    public void PrintVariables(){
        System.out.println("------------PrintVariable Method---------------");
        System.out.println(instanceVar);
        System.out.println(staticVariable);
    }

    public static void PrintVarFromStaticMethod(){
        System.out.println("-------------PrintVarFromStaticMethod---------");
        //System.out.println(instanceVar);  //Error
        System.out.println(staticVariable);
    }
}
public class StaticVariables {
    public static void main(String[] args) {
        StaticVarDemoClass staticClass = new StaticVarDemoClass();
        //Accessing a Instance Variable
        System.out.println(staticClass.instanceVar);
        
        //Accessing a Static Variable
        System.out.println(StaticVarDemoClass.staticVariable);


        //Calling a PrintVariable method
        staticClass.PrintVariables();
        StaticVarDemoClass.PrintVarFromStaticMethod();
    }
    
}
