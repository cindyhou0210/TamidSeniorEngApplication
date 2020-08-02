import java.util.*;
public class TruckWorker extends Staff {
  private String name;
  private int age;
  private int wage;
  private boolean employStatus;
  private boolean permission;

  public TruckWorker(String name, int age, int wage){
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
