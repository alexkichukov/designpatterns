package strategy;

import models.IceCream;

public class EatOnBeachStrategy implements EatingStrategy {
  @Override
  public void eat(IceCream iceCream) {
    System.out.println("Eating " + iceCream.getDescription() + " on the beach");
  }
}
