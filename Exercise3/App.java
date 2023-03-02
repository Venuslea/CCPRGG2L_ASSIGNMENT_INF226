public class App {
    public static void main(String[] argsStrings) {

        Weapon sword = new Weapon();

        sword.name = "Aquila Favonia";
        sword.damage = 48;
        sword.rarity = "legend";
        sword.sayMyName();
        sword.sayMyDamage();
        sword.sayMyRarity();
        sword.attack();
        sword.addDamage(6);
        String showNameandRarity = sword.showNameandRarity();
        System.out.print(showNameandRarity);

        Weapon firearms = new Weapon();

        firearms.name = "AK-47";
        firearms.damage = 30;
        firearms.rarity = "Epic";
        
        Weapon siege = new Weapon();

        siege.name = "Cannon";
        siege.damage = 15;
        siege.rarity = "common";
       
        
        
    }
}