package DecoratorPattern.Toppings;

import DecoratorPattern.BasePizza.BasePizza;

//Here we can see that topping has both HAS-A and IS-A relation with BasePizza
//HAS-A because it has BasePizza instance variable
//IS-A because it is inheriting the BasePizza class

public class CornToppings extends BaseToppings{
    BasePizza pizza;
    public CornToppings(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 40;
    }
}
