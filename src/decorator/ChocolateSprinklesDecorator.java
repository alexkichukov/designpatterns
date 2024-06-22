package decorator;

import models.IceCream;

public class ChocolateSprinklesDecorator extends IceCreamDecorator {
  public ChocolateSprinklesDecorator(IceCream iceCream) {
    super(iceCream);
  }

  @Override
  public String getDescription() {
    return decoratedIceCream.getDescription() + " with chocolate sprinkles";
  }
}
