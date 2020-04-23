public class mouseTest{
   public static void main(String[]args){
      Mouse m1 = new Mouse("jerry",4);
      Mouse m2 = new Mouse();
      System.out.println(m1);
      System.out.println(m2);
      m2.setName("tom");
      m2.setAge(27);
      System.out.println(m2);
      System.out.println("The first mouse is "+m1.getAge()+ " years old.");
      System.out.println("The first mouse's name is "+m1.getName()+".");
      System.out.println("The second mouse is "+m2.getAge()+ " years old.");
      System.out.println("The second mouse's name is "+m2.getName()+".");
   }
}
