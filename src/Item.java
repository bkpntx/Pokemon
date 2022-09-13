public class Item {
private int healing;
private int quantity;
    // int healing should be added to the pokemon in position 1's health
    public Item(){
    }

    public Item(int healing,int quantity){
        this.healing = healing;
        this.quantity=quantity;
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
