public class Pokeball extends Item{
    //written by Harris
    // once Pokeball is used (if Pokeball), boolean isGameOver should become true
    // Pokeball extends item as it's an element in the bag but has the simple function of ending the game
    Pokeball(String name, int healing,int quantity){
        super(name, healing,quantity);
    }
}
