public class Order{

   private Pizza pizza;
   private FrenchFries frenchFries;
   private MilkShake milkShake;
   private double cost; 
   
   public Order(Pizza p, FrenchFries f, MilkShake m){
      pizza = p;
      frenchFries = f;
      milkShake = m;
      cost = p.getCost()+f.getCost()+m.getCost();
   }
   
   public Order (){
      pizza = new Pizza();
      frenchFries = new FrenchFries();
      milkShake = new MilkShake();
      cost = pizza.getCost()+frenchFries.getCost()+milkShake.getCost();
   }
   
   public Pizza getPizza(){
      return pizza;
   }
   
   public FrenchFries getFrenchFries(){
      return frenchFries;
   }
   
   public MilkShake getMilkShake(){
      return milkShake;
   }
   
   public double getCost(){
      return cost;
   }
   
   public void setPizza(Pizza p){
      pizza = p;
   }
   
   public void setFrenchFries(FrenchFries f){
      frenchFries = f;
   }
   
   public void setMilkShake(MilkShake m){
      milkShake = m;
   }
   
   public void setCost(double c){
      cost = c;
   }
   
   public boolean equals (Order other){
      return this.pizza.equals(other.pizza) && this.frenchFries.equals(other.frenchFries) && this.milkShake.equals(other.milkShake) && this.cost == other.cost;
   }
   
   public String toString(){
      return "Your order is:\n"+pizza+"\n"+frenchFries+"\n"+milkShake+"\nYour total is $"+cost;
   }
}