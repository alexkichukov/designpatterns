package factory;

import models.IceCream;

public class VanillaIceCreamFactory extends IceCreamFactory {
  @Override
  public IceCream createIceCream() {
    return new IceCream("vanilla");
  }
}