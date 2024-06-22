package models;

public class IceCream {
  private String flavor;

  public IceCream(String flavor) {
    this.flavor = flavor;
  }

  public String getFlavor() {
    return flavor;
  }

  public String getDescription() {
    return flavor + " ice cream";
  }
}
