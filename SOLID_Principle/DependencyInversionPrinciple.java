package SOLID_Principle;
/*
 D- Dependency Inversion Principle
 Class should depend on interfaces rather than concrete class
*/
public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        Keyboard keyboard = new WirelessKeyboard();

    }
}

class WiredKeyboard{

}
class WiredMouse{

}
/*
This Macbook class is hard coded. If we want to implement wireless
mouse and wireless keyboard then we should have to modify it
*/
class MacBook{
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;
    public MacBook(){
        keyboard = new WiredKeyboard();
        mouse = new WiredMouse();
    }
}


/*
Here if we want to change type of keyboard and mouse in Macbook then we should able
to change it with passing argument for constructor
*/
interface Keyboard{
    void type();
}
class WirelessKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("Wireless Keyboard");
    }
}
interface Mouse{
    void type();
}
class NewMacBook{
    private final Keyboard keyboard;
    private final Mouse mouse;

    public NewMacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

