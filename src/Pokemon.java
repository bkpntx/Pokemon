public class Pokemon { // Carson
    Attack firstMove;
    Attack secondMove;
    Attack thirdMove;
    Attack fourthMove;
    int health;
    int level;
    String name;
    boolean isBurned;
    boolean isPoisoned;

    public Pokemon(Attack firstMove, Attack secondMove, Attack thirdMove, Attack fourthMove, int baseHealth, String name, int level){
        this.firstMove = firstMove;
        this.secondMove = secondMove;
        this.thirdMove = thirdMove;
        this.fourthMove = fourthMove;
        this.health = baseHealth + (level * 2); // All Pokemon's health will increase by 2 per level.
        this.level = level;
        this.name = name;
        isBurned = false; // Pokemon will never have a status effect by default.
        isPoisoned = false;
    }

    public Attack getFirstMove() {
        return firstMove;
    }
    public void setFirstMove(Attack firstMove) {
        this.firstMove = firstMove;
    }

    public Attack getSecondMove() {
        return secondMove;
    }
    public void setSecondMove(Attack secondMove) {
        this.secondMove = secondMove;
    }

    public Attack getThirdMove() {
        return thirdMove;
    }
    public void setThirdMove(Attack thirdMove) {
        this.thirdMove = thirdMove;
    }

    public Attack getFourthMove() {
        return fourthMove;
    }
    public void setFourthMove(Attack fourthMove) {
        this.fourthMove = fourthMove;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isBurned() {
        return isBurned;
    }
    public void setBurned(boolean burned) {
        isBurned = burned;
    }

    public boolean isPoisoned() {
        return isPoisoned;
    }
    public void setPoisoned(boolean poisoned) {
        isPoisoned = poisoned;
    }
}
