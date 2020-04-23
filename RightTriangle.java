public class RightTriangle {

   private double base;
   private double height;

   public RightTriangle (double b, double h){
      base = b;
      height = h;
   }
   
   public RightTriangle (){
      base = 1;
      height = 1;
      //this(1,1);
   }
   
   public double getBase(){
      return base;
   }
   
   public double getHeight(){
      return height;
   }
   
   public void setBase(double b){
      base = b;
   }
   
   public void setHeight(double h){
      height = h;
   }
   
   public double hypotenuse(){
      return Math.sqrt(base*base+height*height);
   }
   
   public double area(){
      return (1.0/2)*base*height;
   }
   
   public double perimeter(){
      return base+height+this.hypotenuse();
   }
   
   public String toString(){
      return "base = "+base+"\nheight = "+height+"\narea = "+this.area();
   } 
}