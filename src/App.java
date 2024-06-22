import decorator.ChocolateGlazeDecorator;
import factory.IceCreamFactory;
import factory.VanillaIceCreamFactory;
import models.IceCream;
import models.IceCreamShop;
import strategy.EatOnBeachStrategy;
import strategy.EatingContext;

public class App {
  public static void main(String[] args) {
    // Singleton
    IceCreamShop shop = IceCreamShop.getInstance();

    // Factory
    IceCreamFactory vanillaFactory = new VanillaIceCreamFactory();

    // Decorator
    IceCream vanillaIceCream = new ChocolateGlazeDecorator(vanillaFactory.createIceCream());
    shop.serveIceCream(vanillaIceCream);

    // Strategy
    EatingContext context = new EatingContext();
    context.setStrategy(new EatOnBeachStrategy());
    context.eat(vanillaIceCream);
  }
}
