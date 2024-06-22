package models;

public class IceCreamShop {
  private static IceCreamShop instance;

  public static synchronized IceCreamShop getInstance() {
    if (instance == null) {
      instance = new IceCreamShop();
    }

    return instance;
  }

  public void serveIceCream(IceCream iceCream) {
    System.out.println("Serving " + iceCream.getDescription());
  }
}
