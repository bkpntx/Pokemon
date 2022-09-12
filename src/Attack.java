public class Attack {
    private int damage;
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
    public void setInflictsBurn(boolean inflictsBurn) {
        this.inflictsBurn = inflictsBurn;
    }
    public void setInflictsPoison(boolean inflictsPoison) {
        this.inflictsPoison = inflictsPoison;
    }
    public Attack(int damage, boolean inflictsBurn,boolean inflictsPoison){
        this.damage=damage;
        this.inflictsBurn=inflictsBurn;
        this.inflictsPoison=inflictsPoison;
    }
}
