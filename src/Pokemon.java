public class Pokemon {
    Attack firstMove;
    Attack secondMove;
    Attack thirdMove;
    Attack fourthMove;
    int health;
    int level;
    String name;

    public Pokemon(Attack firstMove, Attack secondMove, Attack thirdMove, Attack fourthMove, int baseHealth, String name, int level){
        this.firstMove = firstMove;
        this.secondMove = secondMove;
        this.thirdMove = thirdMove;
        this.fourthMove = fourthMove;
        this.health = baseHealth + (level * 2); // Health will scale with level, just like in game. This is much more linear however, gaining 2 HP per level.
        this.level = level;
        this.name = name;
    }
}
