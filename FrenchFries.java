public class FrenchFries{

   private String size;
   private double cost;
   
   public FrenchFries(String s, double c){
      size = s;
      cost = c;
   }
   public FrenchFries(){
      size = "small";
      cost = 1.99;
   }
   
   public String getSize(){
      return size;
   }
   
   public double getCost(){
      return cost;
   }
   
   public void setSize(String s){
      size = s;
   }
   
   public void setCost(double c){
      cost = c;
   }      
   
   public boolean equals(FrenchFries other){
      return this.size.equals(other.size) && cost == other.cost;
   }
   
   public String toString(){
      return "The "+size+" fries will cost $"+cost;
   }
}
