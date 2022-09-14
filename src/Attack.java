public class Attack {
    // Brantley and Harris
    private int damage;
    private String name;
    private boolean inflictsBurn;
    private boolean inflictsPoison;
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

    public void setInflictsBurn(boolean inflictsBurn) {
        this.inflictsBurn = inflictsBurn;
    }
    public void setInflictsPoison(boolean inflictsPoison) {
        this.inflictsPoison = inflictsPoison;
    }
    public Attack(String name, int damage, boolean inflictsBurn,boolean inflictsPoison){
        this.name = name;
        this.damage=damage;
        this.inflictsBurn=inflictsBurn;
        this.inflictsPoison=inflictsPoison;
    }
}
