package DecoratorPattern.Toppings;

import DecoratorPattern.BasePizza.BasePizza;

public class MushroomToppings extends BaseToppings{
    BasePizza pizza;
    public MushroomToppings(BasePizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost()+10;
    }
}
