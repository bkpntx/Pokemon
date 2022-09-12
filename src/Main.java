public class Main {
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


    static Pokemon charmander = new Pokemon(tackle,ember,scratch,smokescreen,30,"Charmander", 15);
    static Pokemon squirtle = new Pokemon(tackle,withdraw,waterGun, bubbleBeam,30,"  Squirtle",15);
    static Pokemon bulbasaur = new Pokemon(tackle, scratch, vineWhip, leer,30," Bulbasaur",15);
    static Pokemon gengar = new Pokemon(shadowBall,suckerPunch,lick,sludgeWave,60,"    Gengar",80);
    static Pokemon dragonite = new Pokemon(dragonTail,hydroPump,slam,wingAttack,80," Dragonite",80);
    static Pokemon meowth = new Pokemon(tackle,scratch,willOWisp,accelerock,60,"    Meowth",100);
    static Pokemon dialga = new Pokemon(roarOfTime,toxic,metalClaw,dragonClaw,150,"Dialga: God of Time",100);

    static Pokemon[] p1 = {charmander,squirtle,bulbasaur,gengar,dragonite,meowth};
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
    public static void main(String[] args) {
        basePrint();
    }
}
