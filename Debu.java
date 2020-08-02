public class Debu {
  public static void main(String[] args){ // Moved the brackets for clarity.
      final int DAYS = 30;
      double money = 0.01; //Removed static
      int day = 1;  //Changed the datatype to int so that it can be changed.
      while(day < DAYS){ //Modified loop so that it keeps running till day = 30.
        money = 2 * money; //Fixed mis-spelling of money.
        System.out.println("After day " + day +" you have " + money); // Changed which variable is printed.
        day++; //Incrementing loop.
      }
   }
}
