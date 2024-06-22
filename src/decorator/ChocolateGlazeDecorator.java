package decorator;

import models.IceCream;

public class ChocolateGlazeDecorator extends IceCreamDecorator {
  public ChocolateGlazeDecorator(IceCream iceCream) {
    super(iceCream);
  }

  @Override
  public String getDescription() {
    return decoratedIceCream.getDescription() + " with chocolate glaze";
  }
}