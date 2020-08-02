import java.util.*;
public class Icecream{
  private String name;
  private int priceCus;
  private int priceTruck;
  private int initialScoops;

  public Icecream(String name, int priceCus, int priceTruck, int initialScoops){
    this.name = name;
    this.priceCus = priceCus;
    this.priceTruck = priceTruck;
    this.initialScoops = initialScoops;
  }
  public String getName(){
    return name;
  }

  public int getPriceCus(){
    return priceCus;
  }

  public int getPriceTruck(){
    return priceTruck;
  }

  public int initialScoops(){
    return initialScoops;
  }
}
