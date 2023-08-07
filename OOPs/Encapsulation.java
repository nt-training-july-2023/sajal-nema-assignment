public class Encapsulation{
        private int StuId;
        private String StuName;
        
        public void SetDetails(int Id , String name){
            StuId = Id;
            StuName = name;
        }

        public void PrintDetails(){
            System.out.println("Student Name is " + StuName);
            System.out.println("Student Id is  " + StuId);
        }
}

class Main{
    public static void main(String[] args){
        Encapsulation obj1 = new Encapsulation();
        //Student 1 :
        obj1.SetDetails(0,"Sajal");
        obj1.PrintDetails();

        //Student 2 :
        Encapsulation obj2 = new Encapsulation();
        obj2.SetDetails(1 , "Sameer");
        obj2.PrintDetails();

        //Student 3:
        Encapsulation obj3 = new Encapsulation();
        obj3.SetDetails(2 , "John");
        obj3.PrintDetails();
    }
}