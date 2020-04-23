public class MilkShake{

   private String flavor;
   private double cost;
   
   public MilkShake (String f, double c){
      flavor = f;
      cost = c;
   }
   
   public MilkShake (){
      flavor = "vanilla";
      cost = 4.99;
   }
    
   public String getFlavor(){
      return flavor;
   }
   
   public double getCost(){
      return cost;
   }
   
   public void setFlavor(String f){
      flavor = f;
   }
   
   public void setCost(double c){
      cost = c;
   }
   
   public boolean equals(MilkShake other){
      return this.flavor.equals(other.flavor) && cost == other.cost;
   }
   
   public String toString(){
      return "The "+flavor+" Milkshake will cost $"+cost;     
   }

}