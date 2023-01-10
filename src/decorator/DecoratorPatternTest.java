package decorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {

        //Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
        //Base-Icecream + Crunchy Nuts + Sweet Honey
        //Icecream icecream = new NuttyDecorator(new SimpleIcecream());
        //Base-Icecream + Crunchy Nuts
        //Icecream icecream = new HoneyDecorator(new SimpleIcecream());
        //Base-Icecream + Sweet Honey
        Icecream icecream =new SimpleIcecream();
        // Base-Icecream
        System.out.println(icecream.makeIcecream());
    }
}
