import java.util.*;
public class Driver extends Staff{
  private String name;
  private int age;
  private int wage;
  private boolean employStatus;
  private boolean permission;

  public Driver(String name, int age, int wage){
    this.name = name;
    this.age = age;
    this.wage = wage;
    this.employStatus = true;
    this.permission = true;
  }

  Public String toString(){
    return name + " " + age + " " + wage + " " + employStatus + " " + permission;
  }
}
