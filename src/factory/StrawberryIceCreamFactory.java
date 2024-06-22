package factory;

import models.IceCream;

public class StrawberryIceCreamFactory extends IceCreamFactory {
  @Override
  public IceCream createIceCream() {
    return new IceCream("strawberry");
  }
}