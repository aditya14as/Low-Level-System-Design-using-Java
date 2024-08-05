package DecoratorPattern;

import DecoratorPattern.BasePizza.BasePizza;
import DecoratorPattern.BasePizza.VegDelight;
import DecoratorPattern.Toppings.CornToppings;
import DecoratorPattern.Toppings.PaneerToppings;

//Decorator pattern involves a set of decorator classes that are used to
// wrap concrete components. Decorators provide a flexible alternative to
// subclassing for extending functionality.
// Imagine we have a basic Pizza class, and we want to add different condiments like
// CornToppings, PaneerToppings, etc., to it. Instead of creating multiple subclasses
// for each combination we can use decorators. It reduce the class explosion because if we starts
//creating classes for each then there will be multiple permutations and combinations of class.
public class PizzaStore {
    public static void main(String[] args) {
        //I need veg delight with panner and corn toppings
        BasePizza pizza = new PaneerToppings(new CornToppings(new VegDelight()));
        System.out.println(pizza.cost());
    }
}
