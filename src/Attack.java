public class Attack {
    // written by Brantley and Harris
    private int damage;
    private String name;
    private boolean inflictsBurn;
    private boolean inflictsPoison;

    // getters and setters
    public boolean isInflictsBurn() {
        return inflictsBurn;
    }
    public int getDamage() {
        return damage;
    }
    public boolean isInflictsPoison() {
        return inflictsPoison;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // if a pokemon is inflicted with a status effect, the boolean becomes true
    public void setInflictsBurn(boolean inflictsBurn) {
        this.inflictsBurn = inflictsBurn;
    }
    public void setInflictsPoison(boolean inflictsPoison) {
        this.inflictsPoison = inflictsPoison;
    }
    // basic constructor
    public Attack(String name, int damage, boolean inflictsBurn,boolean inflictsPoison){
        this.name = name;
        this.damage=damage;
        this.inflictsBurn=inflictsBurn;
        this.inflictsPoison=inflictsPoison;
    }
}
