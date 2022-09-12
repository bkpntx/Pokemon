public class Main {
    static Attack tackle = new Attack(35,false,false);
    static Attack accelerock = new Attack(40,false,false);
    static Attack ember = new Attack(40,false,false);
    static Attack scratch = new Attack(30,false,false);
    static Attack smokescreen = new Attack(0,false,false);
    static Attack willowisp = new Attack(0,true,false);
    static Attack bubblebeam = new Attack(50, false,false);
    static Attack withdraw = new Attack(0,false,false);
    static Attack watergun = new Attack(40,false,false);
    static Attack vinewhip = new Attack(40,false,false);
    static Attack leer = new Attack(0,false,false);
    static Attack shadowball = new Attack(80,false,false);
    static Attack suckerpunch = new Attack(20,false,false);
    static Attack lick = new Attack(10,false,false);
    static Attack sludgewave = new Attack(60,false,true);
    static Attack dragontail = new Attack(40,false,false);
    static Attack hydropump = new Attack(120,false,false);
    static Attack slam = new Attack(70,false,false);
    static Attack wingattack = new Attack(50,false,false);
    static Attack roaroftime = new Attack(140,false,false);
    static Attack toxic = new Attack(0,false,true);
    static Attack metalclaw = new Attack(60,false,false);
    static Attack dragonclaw = new Attack(80,false,false);
    static Pokemon charmander = new Pokemon(tackle,ember,scratch,smokescreen,30,"Charmander", 15);
    static Pokemon squirtle = new Pokemon(tackle,withdraw,watergun, bubblebeam,30,"Squirtle",15);
    static Pokemon bulbasaur = new Pokemon(tackle, scratch, vinewhip, leer,30,"Bulbasaur",15);
    static Pokemon gengar = new Pokemon(shadowball,suckerpunch,lick,sludgewave,60,"Gengar",80);
    static Pokemon dragonite = new Pokemon(dragontail,hydropump,slam,wingattack,80,"Dragonite",80);
    static Pokemon meowth = new Pokemon(tackle,scratch,willowisp,accelerock,60,"Meowth",100);
    static Pokemon dialga = new Pokemon(roaroftime,toxic,metalclaw,dragonclaw,150,"Dialga: God of Time",100);
    public static void fill(String current){
        while (current.length()<29){
            current=current+" ";
        }
        current=current+"*";
    }
    public static void basePrint(){
        System.out.println("*****************************");
        System.out.println("*"+);
    }
    public static void main(String[] args) {
    }
}
