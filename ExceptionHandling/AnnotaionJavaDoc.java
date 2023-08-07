/*Task 1 :
write a program to calculate Area of -
 Rectangle
 Circle
 Triangle
Make use of Appropriate annotations and javadoc .
*/

public class AnnotaionJavaDoc{
    /**
     * This Function Calculates the area of Rectangle
     * @param length  This int type argument determines the length of an Rectangle.
     * @param breadth This int type argument determines the breadth of an Rectangle.
     * @return This return int value , the area of rectangle
     */
    public int CalculateRectangleArea(int length , int breadth){
        return length*breadth;
    }

    /**
     * This function is used to calculate the area of Circle.
     * @param radius This int type argument represents the radius of the Circle.
     * @return This return double value , the area of Circle
     */
    public double CalculateCircleArea(int radius){
        return Math.PI*radius*radius;
    }

    /**
     * This Function is used to return the area of Triangle
     * @param height This int type argument represents the height of the Triangle
     * @param base  This int type argument represents the base of the Triangle
     * @return  This returns the int type value represents the area of Triangle
     */
    public int CalculateTriangleArea(int height , int base){
        return (height*base)/2;
    }

    public static void main(String[] args) {
        AnnotaionJavaDoc obj = new AnnotaionJavaDoc();
        int RecArea = obj.CalculateRectangleArea(12, 12);
        System.out.println("The area of Rectangle is " + RecArea);

        double CircleArea = obj.CalculateCircleArea(23);
        System.out.println("The area of Circle is " + CircleArea);

         int TriangleArea = obj.CalculateTriangleArea(5,8);
        System.out.println("The area of Triangle is " + TriangleArea);

    }
}