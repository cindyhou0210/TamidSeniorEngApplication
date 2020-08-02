import java.util.*;
public class Customer{
  private String name;
  private int age;
  private int cash;

  public Customer(String name, int age, int cash){
    this.name = name;
    this.age = age;
    this.cash = cash;
  }
  public boolean cashCheck(int amount){
    if(this.cash < amount){
      return false;
    }
    return true;
  }
  public String toString(){
    return name + " " + age + " "  + cash;
  }


}
