public class Armor extends Item
{
  int defense;
  String name;
  int weight;
  
  public int getDefense()
  {
    defense = 0;
    return defense;
  }
  
  public String getName()
  {
    name = "white";
    return name;
  }
  
  public int getWeight()
  {
    weight = 101;
    return weight;
  }
  
  public void examine()
  {
    System.out.println(defense + " " + name + " " + weight);
  }
}