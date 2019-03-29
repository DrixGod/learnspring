package coffe.hub.client.stub;

import coffe.hub.client.model.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeStub {

    private static List<Coffee> coffeeList = new ArrayList<>();

    static {
        Coffee coffee1 = new Coffee(1,"Coffee1","Arabica",8,9,7);
        coffeeList.add(coffee1);
    }

    public static List<Coffee> list(){
        return coffeeList;
    }

    public static Coffee get(int id){
        return coffeeList.stream().filter(coffee -> coffee.getId() == id).findFirst().get();
    }

    public static Coffee add(Coffee coffee){
        coffeeList.add(coffee);
        return coffee;
    }

}
