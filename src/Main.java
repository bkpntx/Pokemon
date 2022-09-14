import java.util.Scanner;
// Work shared between Brantley, Carson and Harris
public class Main {
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
    static Attack roarOfTime = new Attack("Roar of Time",140,false,false);
    static Attack toxic = new Attack("Toxic",0,false,true);
    static Attack metalClaw = new Attack("Metal Claw",60,false,false);
    static Attack dragonClaw = new Attack("Dragon Claw",80,false,false);

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
    static Pokemon[] p1 = {charmander,squirtle,bulbasaur,gengar,dragonite,meowth};
    static Item[] items = {potion, superPotion, hyperPotion, pokeball};
    public static String fill(String current){
        while (current.length()<28){
            current=current+" ";
        }
        return current+"*";
    }

    //written by Brantley
    public static void basePrint(){
        System.out.println("*****************************");
        System.out.println(fill("*"+dialga.getName()+" Lvl "+dialga.getLevel()));
        System.out.println(fill("*HP: "+dialga.getHealth()));
        System.out.println("*                      0    *");
        System.out.println("*                     -|-   *");
        System.out.println("*                     / \\   *");
        System.out.println("*                           *");
        System.out.println("*    0                      *");
        System.out.printf("*   -|-    %s Lvl %d*%n",p1[0].getName(),p1[0].getLevel());
        System.out.printf("*   / \\                HP:%d*%n",p1[0].getHealth());
        System.out.println("*___________________________*");
        System.out.println("*                   |Atk|Bag*");
        System.out.println("*                   |Pok|Run*");
        System.out.println("*****************************");
    }

    //written by Brantley
    public static void atkPrint(){
        System.out.println("*****************************");
        System.out.println("*Attacks                    *");
        System.out.println("*___________________________*");
        System.out.println(fill("*"+p1[0].getFirstMove().getName()));
        System.out.println(fill("*"+p1[0].getSecondMove().getName()));
        System.out.println(fill("*"+p1[0].getThirdMove().getName()));
        System.out.println(fill("*"+p1[0].getFourthMove().getName()));
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*****************************");
    }

    //written by Brantley
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
    public static void pokemonPrint(){
        System.out.println("*****************************");
        System.out.println("*Pokemon                    *");
        System.out.println("*___________________________*");
        for (int i = 1; i < p1.length; i++) {
            if (p1[i].getHealth() != 0) {
                System.out.println(fill("*Lvl " + p1[i].getLevel() + " " + p1[i].getName()));
            }
        }
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*****************************");

    }
    public static void menu(){
        Scanner input = new Scanner(System.in);
    }
    public static void enemyPlay(){

    }

    public static void run(){
    System.out.println("You have fled the battle!");
    System.exit(0);
    }

    public static void bag(){

    }

    public static void attack(Attack hit, Pokemon target){
        target.setHealth(target.getHealth()-hit.getDamage());
        if (hit.isInflictsBurn()){
            target.setBurned(true);
        }
        if (hit.isInflictsPoison()){
            target.setPoisoned(true);
        }
    }

    public static void switchPokemon(){

    }








































    public static void main(String[] args) {
        bagPrint();
        enum menuOpen{battle, attack, bag, pokemon}
        System.out.println("Enter 0 to run, 1 to choose an attack, 2 to open your bag, and 3 to change pokemon");
        pokemonPrint();
    }
}
