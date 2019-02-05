
public class StartGame {
  
  public static void main(String[] args) {
   
    Player player1 = new Player();
    player1.setName("Mr. Bartucz");
    
    System.out.println("Player1 name is: " + player1.getName());
    
    // this won't work until you create a getHealth method in your object. Uncomment it when you do.
    System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
    
    Player player2 = new Player();
    player2.setName("Bryce");
    player2.setHealth(5);
    System.out.println(player2.getName() + "'s health is: " + player2.getHealth());
    
    Skill spell = new Skill("Fireball", 28);
    System.out.println(spell.getName() + "'s strenght is: " + spell.getStrength());
    spell.setName("Ice Knife");
    spell.setStrength(12);
    System.out.println(spell.getName() + "'s strenght is: " + spell.getStrength());
    
    player2.hit(spell);
    System.out.println(player2.getName() + "'s health is: " + player2.getHealth());
    
    spell.setName("Mass Cure Wounds");
    spell.setStrength(-18);
    player2.hit(spell);
    System.out.println(player2.getName() + "'s health is: " + player2.getHealth());
  }  
  
}