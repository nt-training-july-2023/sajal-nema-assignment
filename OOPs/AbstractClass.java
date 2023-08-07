abstract class Car{
    abstract void setName(String s);
    abstract void setColor(String s);
    abstract void setGear(int i);
    abstract void CarDetails();
}

class Maruti extends Car{
    private String name , color;
    private int gear;
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setGear(int gear){
        this.gear = gear;
    }
    public void CarDetails(){
        System.out.println("The name of the Car is " + name + " of Maruti Comapany \n" + "The Color is " + color + "\nIt have " + gear + " gears");
    }
}

class Tata extends Car{
    private String name , color;
    private int gear;
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setGear(int gear){
        this.gear = gear;
    }
    public void CarDetails(){
        System.out.println("The name of the Car is " + name + " of Tata Comapany \n" + "The Color is " + color + "\nIt have " + gear + " gears");
    }
}


public class AbstractClass {
        public static void main(String[] args) {
            Maruti m1 = new Maruti();
            m1.setName("Shift Dezire");
            m1.setColor("Shine Gray");
            m1.setGear(6);
            m1.CarDetails();

            Tata t1 = new Tata();
            t1.setName("Harrier");
            t1.setColor("White");
            t1.setGear(8);
            t1.CarDetails();
        }
}
