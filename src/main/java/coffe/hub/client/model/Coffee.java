package coffe.hub.client.model;

import javax.persistence.Entity;

@Entity
public class Coffee {

    private int id;
    private String coffeeName;
    private String coffeeType;
    private int flavour;
    private int sweetness;
    private int strong;

    public Coffee(){}

    public Coffee(int id, String coffeeName, String coffeeType, int flavour, int sweetness, int strong) {
        this.id = id;
        this.coffeeName = coffeeName;
        this.coffeeType = coffeeType;
        this.flavour = flavour;
        this.sweetness = sweetness;
        this.strong = strong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public int getFlavour() {
        return flavour;
    }

    public void setFlavour(int flavour) {
        this.flavour = flavour;
    }

    public int getSweetness() {
        return sweetness;
    }

    public void setSweetness(int sweetness) {
        this.sweetness = sweetness;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }
}
