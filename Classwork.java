import java.util.Scanner;

public class Classwork
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("What type of item are you buying?");
    String item;
    item = sc.nextLine();
    System.out.println("How many are you buying?");
    int quantity = sc.nextInt();
    System.out.println("How much does each one weigh?");
    double weight = sc.nextDouble();
    double total = quantity*weight;
    System.out.println(quantity + " " + item + " at " + weight + " pounds each will weigh " + total + " pounds total");

    System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\"\nAda Lovelace\nThe first computer programmer");

    System.out.println("(\\(\\\n( - -)\n((') (')");
  }
}

