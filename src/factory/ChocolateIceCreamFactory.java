package factory;

import models.IceCream;

public class ChocolateIceCreamFactory extends IceCreamFactory {
  @Override
  public IceCream createIceCream() {
    return new IceCream("chocolate");
  }
}