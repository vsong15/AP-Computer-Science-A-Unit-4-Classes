import java.util.*;
public class OrderTest{
   public static void main (String[]args){
      Scanner kb = new Scanner (System.in);
      Order []yourOrder = new Order[10];
      for (int i = 0; i < yourOrder.length; i++){
         System.out.println("Hi. Welcome to Chilly's! To Enter an order press 1, to finish press 2");
         if (kb.nextInt() == 2)
            break;    
         
         System.out.println("Describe your pizza (topping size cost)");
         String t = kb.next();
         int s = kb.nextInt();
         double c = kb.nextDouble();
         Pizza p = new Pizza (t, s, c);
         
         System.out.println("Describe your fries (size, cost)");
         String si = kb.next();
         double co = kb.nextDouble();
         FrenchFries f = new FrenchFries(si, co);
         
         System.out.println("Describe your shake (flavor, cost)");
         String fl = kb.next();
         double cos = kb.nextDouble();
         MilkShake m  = new MilkShake (fl, cos); 
         yourOrder[i] = new Order(p, f, m);
         System.out.println(yourOrder[i]);
              
      }
      
      
      while(true){
         System.out.println("To see the combined total for all orders press 1, to see an individual press 2, or 3 to quit");
         double total = 0;
         for(int i = 0;i < yourOrder.length; i++){
            if(yourOrder[i]!= null)
               total += yourOrder[i].getCost();
         } 
         if (kb.nextInt() == 1)
            System.out.println("Your total for all of your orders is $"+total);
         
         if(kb.nextInt() == 2){
            System.out.println("Which order do you wish to see? (0-9)");
            int orderNumber = kb.nextInt();
            System.out.println("For order #"+orderNumber+" your total is "+yourOrder[orderNumber].getCost());
         } 
         if (kb.nextInt() == 3){
            break;
         }
      }
   }
}