public class Main {
    //attacks
    static Attack tackle = new Attack(35,false,false);
    static Attack accelerock = new Attack(40,false,false);
    static Attack ember = new Attack(40,false,false);
    static Attack scratch = new Attack(30,false,false);
    static Attack smokescreen = new Attack(0,false,false);
    static Attack willOWisp = new Attack(0,true,false);
    static Attack bubbleBeam = new Attack(50, false,false);
    static Attack withdraw = new Attack(0,false,false);
    static Attack waterGun = new Attack(40,false,false);
    static Attack vineWhip = new Attack(40,false,false);
    static Attack leer = new Attack(0,false,false);
    static Attack shadowBall = new Attack(80,false,false);
    static Attack suckerPunch = new Attack(20,false,false);
    static Attack lick = new Attack(10,false,false);
    static Attack sludgeWave = new Attack(60,false,true);
    static Attack dragonTail = new Attack(40,false,false);
    static Attack hydroPump = new Attack(120,false,false);
    static Attack slam = new Attack(70,false,false);
    static Attack wingAttack = new Attack(50,false,false);
    static Attack roarOfTime = new Attack(140,false,false);
    static Attack toxic = new Attack(0,false,true);
    static Attack metalClaw = new Attack(60,false,false);
    static Attack dragonClaw = new Attack(80,false,false);

    //pokemon
    static Pokemon charmander = new Pokemon(tackle,ember,scratch,smokescreen,30,"Charmander", 15);
    static Pokemon squirtle = new Pokemon(tackle,withdraw,waterGun, bubbleBeam,30,"  Squirtle",15);
    static Pokemon bulbasaur = new Pokemon(tackle, scratch, vineWhip, leer,30," Bulbasaur",15);
    static Pokemon gengar = new Pokemon(shadowBall,suckerPunch,lick,sludgeWave,60,"    Gengar",80);
    static Pokemon dragonite = new Pokemon(dragonTail,hydroPump,slam,wingAttack,80," Dragonite",80);
    static Pokemon meowth = new Pokemon(tackle,scratch,willOWisp,accelerock,60,"    Meowth",100);
    static Pokemon dialga = new Pokemon(roarOfTime,toxic,metalClaw,dragonClaw,150,"Dialga: God of Time",100);

    //items
    static Item potion = new Item(20,5);
    static Item superPotion = new Item(50,2);
    static Item hyperPotion = new Item(200,1);
    static Pokeball pokeball = new Pokeball(0,1);

    static Pokemon[] p1 = {charmander,squirtle,bulbasaur,gengar,dragonite,meowth};
    static Item[] items = {potion, superPotion, hyperPotion, pokeball};
    public static String fill(String current){
        while (current.length()<28){
            current=current+" ";
        }
        return current+"*";
    }
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
    public static void atkPrint(){
        System.out.println("*****************************");
        System.out.println("*Attacks                    *");
        System.out.println("*___________________________*");
        System.out.println(fill("*"+p1[0].getFirstMove()));
        System.out.println(fill("*"+p1[0].getSecondMove()));
        System.out.println(fill("*"+p1[0].getThirdMove()));
        System.out.println(fill("*"+p1[0].getFourthMove()));
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*****************************");
    }
    public static void bagPrint(){

    }
    public static void pokemonPrint(){
        System.out.println("*****************************");
        System.out.println("*Pokemon                    *");
        System.out.println("*___________________________*");
        if (p1[1].getHealth()!=0){
            System.out.println(fill("*Lvl "+p1[1].getLevel()+" "+p1[1].getName()));
        }
        if (p1[2].getHealth()!=0){
            System.out.println(fill("*Lvl "+p1[2].getLevel()+" "+p1[2].getName()));
        }
        if (p1[3].getHealth()!=0){
            System.out.println(fill("*Lvl "+p1[3].getLevel()+" "+p1[3].getName()));
        }
        if (p1[4].getHealth()!=0){
            System.out.println(fill("*Lvl "+p1[4].getLevel()+" "+p1[4].getName()));
        }
        if (p1[5].getHealth()!=0){
            System.out.println(fill("*Lvl "+p1[5].getLevel()+" "+p1[5].getName()));
        }
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*                           *");
        System.out.println("*****************************");
    }


















































































































    public static void main(String[] args) {
        basePrint();
        enum menuOpen{battle, attack, bag, pokemon}
        System.out.println("Enter 0 to run, 1 to choose an attack, 2 to open your bag, and 3 to change pokemon");
    }
}
