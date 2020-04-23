public class RightTriangleTest {
   public static void main(String[]args){
      RightTriangle r1 = new RightTriangle(3,4);
      RightTriangle r2 = new RightTriangle();
      System.out.println(r1);
      System.out.println(r2);
      r2.setBase(6);
      r2.setHeight(8);
      System.out.println(r2);
      System.out.println("The hypotenuse of the first triangle with a height of "+r1.getHeight()+" is "+r1.hypotenuse());
      System.out.println("The perimeter of the second triangle with a baes of "+r2.getBase()+" is "+r2.perimeter());
   }
}