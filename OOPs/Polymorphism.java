class AudioPlayer{
    public void play(){
        System.out.println("Playing Audio");
    }
}

class VideoPlayer extends AudioPlayer{
    @Override
    public void play(){
        System.out.println("Playing Video");
    }   
}

public class Polymorphism {
  //Function Overloading for Calculating area of different shapes
   public double calculateArea(double radius){
        return Math.PI * radius * radius;
    }

    public int calculateArea(int side ){
        return side*side;
    }

    public int calculateArea(int l , int b){
        return l*b;
    }

    
    public static void main(String[] args) {
        Polymorphism shape = new Polymorphism();
        double circleArea =  shape.calculateArea(4.4);
        System.out.println("Area of Circle is : " + circleArea);

        int sqaureArea = shape.calculateArea(4);
        System.out.println("Area of Sqaure id " + sqaureArea);


        int rectangleArea = shape.calculateArea(5,7);
        System.out.println("Area of Retangle is " + rectangleArea);

        
        //Method Overriding
        AudioPlayer audio = new VideoPlayer();
        audio.play();
    }
}
