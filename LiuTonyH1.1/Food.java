public class Food extends Item
{
  int nutrition;
  int quantity;
  int weight;
  String name;
  
  public int getNutrition()
  {
    nutrition = 1999;
    return nutrition;
  }
  
  public int getQuantity()
  {
    quantity = 2;
    return quantity;
  }
  
  public void setQuantity(int newQuantity)
  {
    quantity = newQuantity;
  }
  
  public int getWeight()
  {
    weight = 34;
    return weight;
  }
  
  public String getName()
  {
    name = "apple";
    return name;
  }
  
  public void examine()
  {
    System.out.println(nutrition + " " + quantity + " " + weight + " " + name);
  }
}
