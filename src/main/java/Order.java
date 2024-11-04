import java.util.ArrayList;
import java.util.Scanner;

public class Order {

   public static void main(String[]args) {
       Scanner scan = new Scanner(System.in);
       orderD order1=  new orderD();
       order1.setID("mo0jjf9m7");
       order1.setName("mark");
       order1.setQuant(1);
       System.out.println("order id :" + order1.getID());
       System.out.println("customer name :" + order1.getName());
       System.out.println("order Quantity :" + order1.getQuant());
       orderD order2=  new orderD();
       order2.setID("muhi223g");
       order2.setName("joe");
       order2.setQuant(12);
       System.out.println("order id :" + order2.getID());
       System.out.println("customer name :" + order2.getName());
       System.out.println("order Quantity :" + order2.getQuant());

       while() {
           try {
               int[] anArray = {};
               ArrayList<String> arraylist = new ArrayList<>();
               arraylist.add(order2.getID());
               arraylist.add(order1.getID());
               System.out.println("please enter order id ");
               int id;
               id = Integer.parseInt(scan.nextLine());
               order2.setID(String.valueOf(id));
           } catch (NumberFormatException E) {
               System.out.println("try again No letter allowed");
           }
       }


       }

    }

