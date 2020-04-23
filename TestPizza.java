public class TestPizza{
   
   public static void main(String[] args) {
      
      Pizza pizza1 = new Pizza();
      Pizza pizza2 = new Pizza("pepperoni", 16, 18.99);
      Pizza pizza3 = new Pizza("pepperoni", 16, 18.99);
      
      System.out.println(pizza1);
      System.out.println(pizza2);
      System.out.println(pizza3);
      
      pizza1.setSize(10);
      pizza1.setTopping("cheese");
      pizza1.setCost(9.99);
         //should look like- 
      	//Pizza #1:  10 inch cheese Pizza will cost $9.99 
      	//Pizza #2:  16 inch Poptart Pizza will cost $18.99
   		//....etc
      	
      if(pizza1.equals(pizza2))
         System.out.println("pizza 1 matches pizza 2!!! :)");
      else
         System.out.println("pizza 1 doesn't match pizza 2 :(");
   		//if pizza1 equals pizza2 print "pizza1 matches pizza2"
   		//else print "pizza1 doesn't match pizza2"
      if(pizza2.equals(pizza3))
         System.out.println("pizza 2 matches pizza 3!!! :)");
      else
         System.out.println("pizza 2 doesn't match pizza 3 :(");	
   		//if pizza2 equals pizza3 print "pizza2 matches pizza3"
   		//else print "pizza2 doesn't match pizza3"
   		
   		//This is how to use a "getter" method to see private data
      String top2= pizza2.getTopping();
      System.out.println("The topping of Pizza #2 is "+top2);
   }
}