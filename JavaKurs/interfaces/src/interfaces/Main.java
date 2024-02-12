package interfaces;

public class Main {
     public static void main(String[] args) {

         Logger[] loggers= { new SmsLogger(), new DatabaseLogger()}; // loggers içinde bunlar olabilir dedik

         CustomerManager customerManager= new CustomerManager(loggers);


         Customer ezgi= new Customer(1, "Ezgi", "Karakaya");
         customerManager.add(ezgi); //ekleyebilmek için müşteri lazımdı Customer ile oluşturduk

         System.out.println(" ");


         Customer eren= new Customer(2,"Eren","Karakaya");
         customerManager.delete(eren);
    }
}
