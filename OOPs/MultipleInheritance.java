interface Tea{
    void createTea();
}

interface Coffee{
    void createCoffee();
}

class Product implements Tea,Coffee{
    int milkQauntity,sugarQuantity;

    public Product(int milkQauntity , int sugarQuantity){
        this.milkQauntity = milkQauntity;
        this.sugarQuantity = sugarQuantity;
    }

    
    @Override
    public void createTea(){
        int TotalCups = (int)Math.min(milkQauntity/0.5 , sugarQuantity/0.3);
        System.out.println("Based on Available Milk and Sugar , the total number of Tea Cups Possible are : " + TotalCups);
    }

    @Override
    public void createCoffee(){
        int TotalCoffee = (int)Math.min(milkQauntity/0.7 , sugarQuantity/0.4);
        System.out.println("Based on Available Milk and Sugar , the total number of Tea Cups Possible are : " + TotalCoffee);
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Product p1 = new Product(34 , 54);
        p1.createTea();
        p1.createCoffee();  
    }
}
