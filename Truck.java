import java.util.*;
public class Truck{
  private ArrayList<String> flavors;
  private ArrayList<Icecream> icecreams;
  private int total; //total money
  private int sale; //sales of icecream
  private int saleCash; //cash
  private int inStock;
  private ArrayList<Staff> staff;
  private ArrayList<String> drivers;
    private ArrayList<String> workers;

  public Truck(){
    flavors = new ArrayList<String>();
    staff = new ArrayList<Staff>();
    icecreams = new ArrayList<Icecream>();
    drivers = new ArrayList<String>();
    workders = new ArrayList<String>();
    this.total = 0;
    this.sale = 0;
    this.saleCash = 0;
    this.inStock = 0;
  }

  public void addWorkers(TruckWorker a){
    workers.add(a);
    staff.add(a);
  }

  public void addDrivers(TruckWorker a){
    drivers.add(a);
    staff.add(a);
  }

  public void remove(Staff a){
    if(staff.contains(a){
      staff.remove(a);
      a.employStatus == false;
      a.permission == false;
    }
  }
  public void addFlav(Icecream newF){
    flavors.add(newF.getName());
    icecreams.add(newF);
  }

  public String getEmployee(){
    return staff.toString();
  }
}
