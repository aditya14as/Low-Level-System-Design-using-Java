package DecoratorPattern.Toppings;

import DecoratorPattern.BasePizza.BasePizza;

public class PaneerToppings extends BaseToppings{
    BasePizza pizza;
    public PaneerToppings(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+20;
    }
}
