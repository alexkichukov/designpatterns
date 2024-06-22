package strategy;

import models.IceCream;

public class EatInStoreStrategy implements EatingStrategy {
  @Override
  public void eat(IceCream iceCream) {
    System.out.println("Eating " + iceCream.getDescription() + " in the store");
  }
}
