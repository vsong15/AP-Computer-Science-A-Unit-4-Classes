public class Mouse {

   private String name;
   private int age;
   
   public Mouse(String n, int a){
      name = n;
      age = a;
   }
   
   public Mouse(){
      name="";
      age = 0;
   }
   
   public String getName(){
      return name;
   }
   
   public int getAge(){
      return age;
   }
   
   public void setName(String n){
      name = n;
   }
   
   public void setAge(int a){
      age = a;
   }
   
   public String toString(){
      return name+" the mouse is "+age+" years old.";
   }
}