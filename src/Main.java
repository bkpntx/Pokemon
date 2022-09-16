import java.util.Scanner;
// Work shared between Brantley, Carson and Harris
public class Main {
    static enum menuOpen{run, attack, bag, pokemon}
    static Scanner input = new Scanner(System.in);
    //attacks written by Harris
    static Attack tackle = new Attack("Tackle", 35,false,false);
    static Attack accelerock = new Attack("Accelerock",40,false,false);
    static Attack ember = new Attack("Ember",40,false,false);
    static Attack scratch = new Attack("Scratch",30,false,false);
    static Attack smokescreen = new Attack("Smokescreen",0,false,false);
    static Attack willOWisp = new Attack("Will O' Wisp",0,true,false);
    static Attack bubbleBeam = new Attack("Bubblebeam", 50, false,false);
    static Attack withdraw = new Attack("Withdraw",0,false,false);
    static Attack waterGun = new Attack("Water Gun",40,false,false);
    static Attack vineWhip = new Attack("Vine Whip",40,false,false);
    static Attack leer = new Attack("Leer",0,false,false);
    static Attack shadowBall = new Attack("Shadow Ball",80,false,false);
    static Attack suckerPunch = new Attack("Sucker Punch",20,false,false);
    static Attack lick = new Attack("Lick",10,false,false);
    static Attack sludgeWave = new Attack("Sludge Wave",60,false,true);
    static Attack dragonTail = new Attack("Dragon Tail",40,false,false);
    static Attack hydroPump = new Attack("Hydro Pump",120,false,false);
    static Attack slam = new Attack("Slam",70,false,false);
    static Attack wingAttack = new Attack("Wing Attack",50,false,false);
    static Attack roarOfTime = new Attack("Roar of Time",120,false,false);
    static Attack toxic = new Attack("Toxic",0,false,true);
    static Attack metalClaw = new Attack("Metal Claw",60,false,false);
    static Attack dragonClaw = new Attack("Dragon Claw",40,false,false);

    //pokemon written by Harris
    static Pokemon charmander = new Pokemon(tackle,ember,scratch,smokescreen,30,"Charmander", 15);
    static Pokemon squirtle = new Pokemon(tackle,withdraw,waterGun, bubbleBeam,30,"Squirtle",15);
    static Pokemon bulbasaur = new Pokemon(tackle, scratch, vineWhip, leer,30,"Bulbasaur",15);
    static Pokemon gengar = new Pokemon(shadowBall,suckerPunch,lick,sludgeWave,60,"Gengar",80);
    static Pokemon dragonite = new Pokemon(dragonTail,hydroPump,slam,wingAttack,80,"Dragonite",80);
    static Pokemon meowth = new Pokemon(tackle,scratch,willOWisp,accelerock,60,"Meowth",100);
    static Pokemon dialga = new Pokemon(roarOfTime,toxic,metalClaw,dragonClaw,150,"Dialga: God of Time",100);

    //items written by Harris
    static Item potion = new Item("Potion", 20,5);
    static Item superPotion = new Item("Super Potion", 50,2);
    static Item hyperPotion = new Item("Hyper Potion", 200,1);
    static Pokeball pokeball = new Pokeball("Pokeball",0,1);

    //written by Brantley
    static int moveNum = 0;
    static Pokemon[] p1 = {charmander,squirtle,bulbasaur,gengar,dragonite,meowth};
    static Pokemon[] p2 = {dialga};
    static Item[] items = {potion, superPotion, hyperPotion, pokeball};
    // fills the print method such that the borders match
    public static String fill(String current){
        while (current.length()<28){
            current=current+" ";
        }
        return current+"*";
    }
    public static String reverseFill(String current){
        while(current.length()<20){
            current=" "+current;
        }
        return current;
    }

    //written by Brantley
    //shows the default game state
    public static void basePrint(){
        System.out.println("*****************************");
        System.out.println(fill("*"+dialga.getName()+" Lvl "+dialga.getLevel()));
        System.out.println(fill("*HP: "+dialga.getHealth()));
        System.out.println("*                      0    *");
        System.out.println("*                     -|-   *");
        System.out.println("*                     / \\   *");
        System.out.println("*                           *");
        System.out.println("*    0                      *");
        System.out.println("*   -|-  "+reverseFill(p1[0].getName()+" Lvl "+p1[0].getLevel()+"*"));
        System.out.println("*   / \\  "+reverseFill("HP:"+p1[0].getHealth()+"*"));
        System.out.println("*___________________________*");
        System.out.println("*               |1:Atk|2:Bag*");
        System.out.println("*               |3:Pok|4:Run*");
        System.out.println("*****************************");
    }

    //written by Brantley
    //displays attacks
    public static void atkPrint(){
        System.out.println("*****************************");
        System.out.println("*Attacks                    *");
        System.out.println("*___________________________*");
        System.out.println(fill("*1:"+p1[0].getFirstMove().getName()));
        System.out.println(fill("*2:"+p1[0].getSecondMove().getName()));
        System.out.println(fill("*3:"+p1[0].getThirdMove().getName()));
        System.out.println(fill("*4:"+p1[0].getFourthMove().getName()));
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*****************************");
    }

    //written by Brantley
    //displays items in the bag
    public static void bagPrint(){
        System.out.println("*****************************");
        System.out.println("*Bag                        *");
        System.out.println("*___________________________*");
        for(int i = 0; i < items.length; i++) {
            System.out.println(fill("*" + items[i].getQuantity() + "x " + items[i].getName()));
        }
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*****************************");
    }

    //written by Brantley
    //displays the trainer (player)'s 6 pokemon
    public static void pokemonPrint(){
        System.out.println("*****************************");
        System.out.println("*Pokemon                    *");
        System.out.println("*___________________________*");
        for (int i = 1; i < p1.length; i++) {
            if (p1[i].getHealth() >= 0) {
                System.out.println(fill("*"+i+":Lvl " + p1[i].getLevel() + " " + p1[i].getName()));
            }
        }
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*****************************");

    }

    // written by Brantley
    // performs the enemy's (Dialga's) action
    public static void enemyPlay(){
        if (dialga.isBurned){
            dialga.setHealth(dialga.getHealth()-5);
        }
        if (dialga.isPoisoned){
            dialga.setHealth(dialga.getHealth()-10);
        }
        if (dialga.getHealth()<=0){
            System.out.println("The player has won");
            System.exit(0);
        }
        switch (moveNum){
            case 0: attack(dialga.getFirstMove(),p1[0]); break;
            case 1: attack(dialga.getSecondMove(),p1[0]); break;
            case 2: attack(dialga.getThirdMove(),p1[0]); break;
            case 3: attack(dialga.getFourthMove(),p1[0]); break;
        }
        moveNum=(moveNum+1)%4;
        if (p1[0].getHealth()<=0&&inPlay()){ // Written by Carson
            pokemonPrint();
            System.out.println("Which pokemon would you like to swap for " + p1[0].getName() + "?");
            for (int i = 1; i < p1.length; i++) { // i starts at one since a pokemon cannot be swapped for itself.
                if (p1[i].getHealth()>0){
                    System.out.println(i+": "+p1[i].getName());
                }
            }
            int swapFor = input.nextInt();
            switchPokemon(p1[swapFor]);
            System.out.println(p1[0].getName() + " is now in the battle!");
        }
    }

    // written by Carson
    // ends the game when you select run
    public static void run(){
    System.out.println("You have fled the battle!");
    System.exit(0);
    }

    // written by Carson
    // allows for an item to be select from the bag and be used on a pokemon
    public static void bag(Item item, Pokemon target){
        int maxHealth = target.getMaxHealth();
        if (item.getHealing() > 0){
            target.setHealth(target.getHealth() + item.getHealing());
            if(target.getHealth() > maxHealth){
                target.setHealth(maxHealth); // Pokemon cannot exceed max health, so they will just be set to its max health if they do.
            }
            System.out.println(item.getName()+" has been used on "+target.getName()+".");
        }
        if(item.getHealing() == 0){ // If an item has no healing, then it is a pokeball.
            System.out.println(target.getName()+" has been captured. Congratulations, the game is over!");
            System.exit(0);
        }
        item.setQuantity(item.getQuantity() - 1);
    }

    // written by Brantley
    // damages the enemy pokemon and applies an effect if present
    public static void attack(Attack hit, Pokemon target){
        target.setHealth(target.getHealth()-hit.getDamage());
        if (hit.isInflictsBurn()){
            target.setBurned(true);
        }
        if (hit.isInflictsPoison()){
            target.setPoisoned(true);
        }
        System.out.println("Used " + hit.getName() + " on " + target.getName() + "!");
    }

    // written by Harris
    // moves the pokemon in the array when selected to switch
    public static void switchPokemon(Pokemon pokemon){
        Pokemon temporary = p1[0];
        for(int i = 1; i<6; i++){
            if(pokemon == p1[i]){
                p1[0] = pokemon;
                p1[i] = temporary;
            }
        }
    }

    // written by Harris
    public static menuOpen menu(int option){
        switch(option){
            case 1: return menuOpen.attack;
            case 2: return menuOpen.bag;
            case 3: return menuOpen.pokemon;
            case 4: return menuOpen.run;
        }
        return null;
    }

    // written by Brantley
    // checks if there are any pokemon alive
    public static boolean inPlay(){
        int counter=0;
        for (int i=0;i<p1.length;i++){
            if (p1[i].getHealth()>0){
                counter++;
            }
        }
        if (counter>0){
            return true;
        }
        else {
            return false;
        }
    }

    //written by Harris
    public static void main(String[] args) {
        while (inPlay()) { // Written by Carson
            basePrint();

            System.out.println("Please select an option to use 1-4:");
            int option = input.nextInt();
            switch (menu(option)) {
                case attack:
                    atkPrint();
                    // written by Brantley
                    // allows the player to choose a move to use against the enemy
                    System.out.println("Which attack 1-4 would you like to use:");
                    int atk = input.nextInt();
                    switch (atk) {
                        case 1:
                            attack(p1[0].getFirstMove(), dialga);
                            break;
                        case 2:
                            attack(p1[0].getSecondMove(), dialga);
                            break;
                        case 3:
                            attack(p1[0].getThirdMove(), dialga);
                            break;
                        case 4:
                            attack(p1[0].getFourthMove(), dialga);
                            break;
                    }
                    break;
                case bag:
                    // written by Carson
                    // allows the player to select a healing item and use it on an allied pokemon
                    // if the player selects pokeball it ends the game
                    bagPrint();
                    System.out.print("Enter");
                    for (int j = 0; j < items.length; j++) {
                        if (items[j].getQuantity() > 0) {
                            if (j + 1 == items.length) { // This is the last item, so there must be a special statement to change the grammar.
                                System.out.print(" and " + j + " for " + items[j].getName() + ".");
                                System.out.println(); // Added so that user input will go under the options instead of in the same line.
                            } else {
                                System.out.print(" " + j + " for " + items[j].getName() + ","); // gives users options based on the item's position in the item array.
                            }
                        }
                    }
                    int desiredItem = input.nextInt();
                    if (items[desiredItem].getName().contains("ball")) { // If the desired item is a ball, a ball will be thrown at the pokemon currently out.
                        bag(items[desiredItem], p2[0]); // the target of the ball will always be whatever enemy pokemon is out, and the pokemon out is always in array slot 0.
                    }
                    else {
                        System.out.println("Which pokemon would you like to use " + items[desiredItem].getName() + " on?");
                        System.out.print("Enter ");
                        for (int j = 0; j < p1.length; j++) {
                            if (p1[j].getHealth()>0){
                                System.out.println(j+": "+p1[j].getName());
                            }
                        }
                    }
                    int desiredPokemon = input.nextInt();
                    bag(items[desiredItem], p1[desiredPokemon]);
                    break;
                case pokemon:
                    // written by Carson
                    // allows a person to swap another pokemon for their pokemon currently in play or dead
                    pokemonPrint();
                    System.out.println("Which pokemon would you like to swap for " + p1[0].getName() + "?");
                    for (int j = 1; j < p1.length; j++) { // i starts at one since a pokemon cannot be swapped for itself.
                        if (p1[j].getHealth()>0){
                            System.out.println(j+": "+p1[j].getName());
                        }
                    }
                    int swapFor = input.nextInt();
                    switchPokemon(p1[swapFor]);
                    System.out.println(p1[0].getName() + " is now in the battle!");
                    break;
                case run:
                    run();
                    break;
            }
            // prints out the basic state of the game
            basePrint();
            // enemy will move after every turn regardless of the user's choice
            enemyPlay();
        }
        System.out.println("All your pokemon are dead. You have lost.");
    }
}
