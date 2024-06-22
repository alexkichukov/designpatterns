package decorator;

import models.IceCream;

public abstract class IceCreamDecorator extends IceCream {
  protected IceCream decoratedIceCream;

  public IceCreamDecorator(IceCream iceCream) {
    super(iceCream.getFlavor());
    this.decoratedIceCream = iceCream;
  }

  @Override
  public String getDescription() {
    return decoratedIceCream.getDescription();
  }
}
