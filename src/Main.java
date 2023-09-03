import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner sc = new Scanner(System.in);
        boolean condition = true;

        while (condition){
            System.out.println("select a option:");
            System.out.println("1. Buy Coffee");
            System.out.println("2. Add Ingredients");
            System.out.println("3. Take Money");
            System.out.println("4. Show Ingredients");
            System.out.println("5. Show Analytics");
            System.out.println("Any other number for  Exit");

            System.out.println("Enter your choice");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter the coffee name (Espresso, Latte, Cappuccino): ");
                    String coffeeType = sc.next();
                    coffeeMachine.buy(coffeeType);
                    break;
                case 2:
                    System.out.print("Enter the amount of water (ml) to add: ");
                    int waterToAdd = sc.nextInt();
                    System.out.print("Enter the amount of milk (ml) to add: ");
                    int milkToAdd = sc.nextInt();
                    System.out.print("Enter the amount of coffee beans (grams) to add: ");
                    int beansToAdd = sc.nextInt();
                    coffeeMachine.addIngredients(waterToAdd, milkToAdd, beansToAdd);
                    break;
                case 3:
                    coffeeMachine.takeMoney();
                    break;
                case 4:
                    coffeeMachine.showIngredients();
                    break;
                case 5:
                    coffeeMachine.showAnalytics();
                    break;
                default:
                    System.out.println("invalid choice");
                    condition = false;
                    break;
            }
        }


    }
}