import java.awt.*;
import java.util.Scanner;
public class Console{
  public static void main (String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.println("Congratulations! You have decided to start your own Ice Cream Truck! What is your new business's name and how much would you like to invest?");
      String name = console.next();
      int cash = console.nextInt();
      System.out.println()
      System.out.println("Business Name: " + name);
      System.out.println("Start-up Cash: " + cash);
      System.out.println()
      System.out.println("You have created " + name + ", and invested " + cash + "!");
      Customer a = new Customer("ben", 12, 5);
      Customer b = new Customer("Lily", 20, 20);
      Customer c = new Customer("Cindy", 20, 1);
      ArrayList<Customer> list = new ArrayList<Customer>();
      list.add(a);
      list.add(b);
      list.add(c);
      Truck t = new Truck();
      Driver driver1 = new Driver("Chad", 20, 12);
      TruckWorker worker1 = new TruckWorker("Leo", 25, 10);
      System.out.println()
      System.out.println("The following customers are in line: " + list.toString());
      System.out.println()
      System.out.println("Welcome to Liebowitz's Ice Cream Truck!");
      System.out.println("Please select an option from the menu below:");
      System.out.println("1. Add a new Ice Cream Flavor" + "\n" + "2. Hire a new Truck Worker" + "\n" + "3. Hire a new Driver" + "\n" + "4. Show all Employees"
+ "\n" + "5. Show Ice Cream stock" + "\n" + "6. Purchase more Ice Cream of an existing flavor" + "\n" + "7. Display # of sales (both the number of ice cream sold, and the cash those
sales generated)" + "\n" + "8. Close for the day (quit the loop)" );
      System.out.println();
      System.out.println("User Input:");

      int user = 0;
      while(user != 8){
        user = console.nextInt();
        System.out.println(">" + user);
        System.out.println();
        lists(user);

        if(input == 1){
          opt1(t);
        }
        if(input == 2){
          opt2(t);
        }
        if(input == 3){
          opt3(t);
        }
        if(input == 4){
          opt4(t);
        }

        if(input == 5){
          opt5(t);
        }
        if(input == 6){
          opt6(t);
        }
        if(input == 7){
          opt7(t);
        }
        if(input == 8){
          user = 8;
        }
        Customer x = list.get(size - 1);
        list.remove(size - 1);
        int num = randomize();
        String flavor1 = randomizeFlav(t);
        int cost = 0;
        for(int i = 0; i < t.icecreams.size(); i++){
          if(icereams.get(i).getName().equals(flavor1)){
            cost = icecreams.get(i).getPriceCus;
          }
        }
        t.sale += num;

        int total = cost * num;
        t.saleCash += total;
        System.out.print(x.getName() + "has $" + x.cash + "They purchased a" + num + "scoop of " + flavor1 + "for $" + total);


    }

    public static String randomizeFlav(Trucker t){
      Random rand = new Random();
      int rand_int1 = rand.nextInt(t.flavors.size);
      String order = t.flavors.get(rand_int1);
      return order;
    }
    public static int randomize(){
      Random rand = new Random();
      int rand_int1 = rand.nextInt(10);
      return rand_int1;
    }

    }
      public static void opt1(Trucker t){
        System.out.println("what flavor do you want to add");
        System.out.print("name: ");
        String flavor = console.next();
        System.out.println(flavor);
        System.out.print("number of scoops: ");
        int numScoops = console.nextInt();
        System.out.println(numScoops);
        t.inStock += numScoops;
        System.out.println();
        System.out.print("Cost to Customers: ");
        int costCust = console.nextInt();
        System.out.println(costCust);
        System.out.print("Cost to puchase: ");
        int costPurch = console.nextInt();
        System.out.println(costPurch);
        Icecream newFlav = new Icecream(flavor, costCust, costPurch, numScoops);
        t.addFlav(newFlav);
      }

      public static void opt2(Truck t){
        System.out.print("name: ");
        String name = console.next();
        System.out.print("age: ");
        int age = console.nextInt();
        System.out.print("wage: ");
        int wage = console.nextInt();
        TruckWorker newTruck = new TruckWorker(name, age, wage);
        t.addWorkers(newTruck);
      }

      public static void opt3(Drive d){
        System.out.print("name: ");
        String name = console.next();
        System.out.print("age: ");
        int age = console.nextInt();
        System.out.print("wage: ");
        int wage = console.nextInt();
        Driver newDriver = new TruckWorker(name, age, wage);
        t.addDrivers(newDriver);
      }

      public static void opt4(Truck t){
        System.out.println(t.getEmployee());
      }

      public static void opt5(Truck t){
        System.out.println(t.inStock);
      }

      public static void opt6(Truck t){
        System.out.print("what flavor");
        String name = console.next();
        if(t.flavors.contains(name)){
          Icecream b = flavors.get(name);
          System.out.print("How many?");
          int ans = console.nextInt();
          b.initialScoops += ans;
          b.inStock += ans;
        }
      }

      public static void opt7(Trucker t){
        System.out.println("sales in number sold: " + t.sale);
        System.out.println("sales in cash earned: " + t.saleCash);

      }

  }
}
