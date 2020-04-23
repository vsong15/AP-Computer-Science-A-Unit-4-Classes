import java.util.*;
import java.io.*;
public class ExpensivePizza{
   public static void main (String[]args)throws Exception{
      Scanner pizzaList = new Scanner (new File("pizzaList.txt"));
      
      Pizza [] party = new Pizza [30];
      
      for(int i = 0; i < 30; i++){
         
         String topping = pizzaList.next();
         int size = pizzaList.nextInt();
         double cost = pizzaList.nextDouble();
         party[i] = new Pizza(topping, size, cost);
       
      }   
      System.out.println("The expensivest pizza is "+expensivePizza(party));
   }
   public static Pizza expensivePizza(Pizza[]p){
      Pizza expensive = p[0];
      for(int i = 0; i < p.length; i++){
         if(p[i].getCost() > expensive.getCost())
            expensive = p[i];
      }
      return expensive;
   }
}