public class Main {
    static Attack tackle = new Attack(35,false,false);
    static Attack accelerock = new Attack(40,false,false);
    static Attack blueFlare = new Attack(130,true,false);
    static Attack branchPoke = new Attack(40,false,false);
    static Attack gunkShot = new Attack(85,false,true);
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
