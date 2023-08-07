//Single Inheritance

class Account{
    public String name;
    public int age;
}

class SavingAccount extends Account{
    private long accountNumber;

    public void SetDetails(String name ,int age ,  long accountNumber){
        this.name = name;
        this.age = age;
        this.accountNumber = accountNumber;
    }
    public void PrintDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(accountNumber);
    }
}

//Multilevel Inheritence
class University{
    public String universityName;
    public String universityaddress;
}

class College extends University{
    public String collegeName;
    public int clgCode;
}

class Student extends College{
    public String name;
    public int stuAge;
    
    public void SetDetails(String univName , String uniAddress , String clgName  , int code , String stuName , int age){
        universityName = univName;
        universityaddress = uniAddress;
        collegeName = clgName;
        clgCode = code;
        name = stuName;
        stuAge = age;
    }

    public void printStudentDetails(){
        System.out.println("University Name " + universityName);
        System.out.println("University Adress is  " + universityaddress);
        System.out.println("College Name is " + collegeName);
        System.out.println("College Code is " + clgCode);
        System.out.println("Student Name is " + name);
        System.out.println("Student Age is " + stuAge);
    }
}


//Hierarical Inheritance
class Employee {
 double salary = 50000;


 public void displaySalary() {
   System.out.println("Employee Salary: Rs."+salary);
 }
}


class FullTimeEmployee extends Employee{
 double hike = 0.50;

 public void incrementSalary() {
   salary = salary + (salary * hike);
 }
}

class PartTimeEmployee extends Employee{
 double hike = 0.25;

 void incrementSalary() {
   salary = salary + (salary * hike);
 }
}


//Multiple Inheritance
interface Shape{
    void drawShape();
}

interface Color{
    void fillColor();
}


class ColorShape implements Shape , Color{
    private String shapeType;
    private String ColorName;

    public ColorShape(String shapeType , String color){
        this.shapeType = shapeType;
        this.ColorName = color;
    }

    @Override
    public void drawShape(){
        System.out.println("Drawing a " + ColorName +  " " + shapeType);
    }

    @Override
    public void fillColor(){
        System.out.println("Filling the " + shapeType + " with " + ColorName + " color");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        //Single Inheritancet
        System.out.println("-----------------------Single Inheritance-------------------");
        SavingAccount s1 = new SavingAccount();

        s1.SetDetails("Sajal", 22, 87478673764l);
        s1.PrintDetails();

        SavingAccount s2 = new SavingAccount();
        s2.SetDetails("Rahul",25,2989778938l);
        s2.PrintDetails();

        //Multilevel Inheritance
        System.out.println("--------------------Multilevel Inheritance-----------------------");
        Student stu1 = new Student();
        stu1.SetDetails("RGPV" , "Bhopal" ,  "Shri Ram Institute of Technology" , 202 , "Sajal Nema", 22);
        stu1.printStudentDetails();

        //Hierarchical Inheritance
        System.out.println("----------------------Hierarchical Inheritance----------------------");
         FullTimeEmployee emp1 = new FullTimeEmployee();
         PartTimeEmployee emp2 = new PartTimeEmployee();

         System.out.println("Salary of a full-time employee before incrementing:");
         emp1.displaySalary();


        System.out.println("Salary of an intern before incrementing:");
        emp2.displaySalary();

        emp1.incrementSalary();
        emp2.incrementSalary();

        System.out.println("Salary of a full-time employee after incrementing:");
        emp1.displaySalary();

        System.out.println("Salary of an intern after incrementing:");
        emp2.displaySalary();


        //Multiple Inheritance
        System.out.println("-----------------Multiple Inheritance-----------------------");
        ColorShape circle = new ColorShape("Circle", "Yellow");
        circle.drawShape();
        circle.fillColor();

        ColorShape rectangleShape = new ColorShape("Rectangle", "Orange");
        rectangleShape.drawShape();
        rectangleShape.fillColor();
    }
}
