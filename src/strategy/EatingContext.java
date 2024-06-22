package strategy;

import models.IceCream;

public class EatingContext {
  private EatingStrategy strategy;

  public void setStrategy(EatingStrategy strategy) {
    this.strategy = strategy;
  }

  public void eat(IceCream iceCream) {
    strategy.eat(iceCream);
  }
}