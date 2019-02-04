public class Skill{
  private String name;
  private int strength;
  
  public Skill(String aName, int aStrength){
    name = aName;
    strength = aStrength;
  }
  
  public void setName(String aName){
    name = aName;
  }
  public void setStrength(int aStrength){
    strength = aStrength;
  }
  public int getStrength(){
    return strength;
  }
  public String getName(){
    return name;
  }
}