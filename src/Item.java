public class Item {
private int healing;
private int quantity;
private String name;
    // int healing should be added to the pokemon in position 1's health
    public Item(){
    }

    public Item(String name, int healing,int quantity){
        this.name = name;
        this.healing = healing;
        this.quantity=quantity;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
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
