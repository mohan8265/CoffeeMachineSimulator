public class CoffeeMachine {
    private int waterQuantity;
    private int milkQuantity;
    private int beanQuantity;
    private int moneyEarned;
    private int espressoCnt;
    private int latteCnt;
    private int cappuccinoCnt;

    public CoffeeMachine() {
        this.waterQuantity = 0;
        this.milkQuantity = 0;
        this.beanQuantity = 0;
        this.moneyEarned = 0;
        this.espressoCnt = 0;
        this.latteCnt = 0;
        this.cappuccinoCnt = 0;
    }

    public void buy(String coffeeName){
        int price = 0;
        int waterNeeded = 0;
        int milkNeeded = 0;
        int beansNeeded = 0;

        switch (coffeeName.toLowerCase()){
            case "espresso":
                price = 4;
                waterNeeded = 250;
                milkNeeded = 0;
                beansNeeded = 16;
                break;
            case "latte":
                price = 7;
                waterNeeded = 350;
                milkNeeded = 75;
                beansNeeded = 20;
                break;
            case "cappuccino":
                price = 6;
                waterNeeded = 200;
                milkNeeded = 100;
                beansNeeded = 12;
                break;

            default:
                System.out.println("Invalid coffee name");
                return;
        }

        if(this.waterQuantity >= waterNeeded && this.milkQuantity >= milkNeeded && this.beanQuantity >= beansNeeded){
            System.out.println("making your " + coffeeName + " please wait a while");
            this.waterQuantity -= waterNeeded;
            this.milkQuantity -= milkNeeded;
            this.beanQuantity -= beansNeeded;
            this.moneyEarned += price;

            switch (coffeeName.toLowerCase()){
                case "espresso":
                    espressoCnt++;
                    break;
                case "latte":
                    latteCnt++;
                    break;
                case "cappuccino":
                    cappuccinoCnt++;
                    break;
            }
        }else {
            System.out.println("not enough ingredients available for making " +coffeeName);
        }

    }

    public void addIngredients(int water,int milk,int beans){
        this.waterQuantity += water;
        this.milkQuantity += milk;
        this.beanQuantity += beans;
    }

    public void takeMoney(){
        System.out.println("Taking " + moneyEarned + " $");
        moneyEarned = 0;
    }

    public void showIngredients(){
        System.out.println("water " + waterQuantity);
        System.out.println("milk " + milkQuantity);
        System.out.println("beans " + beanQuantity);
    }


    public void showAnalytics() {
        System.out.println("Coffee sold: ");
        System.out.println("Espresso: " + espressoCnt + " cups");
        System.out.println("Latte: " + latteCnt + " cups");
        System.out.println("Cappuccino: " + cappuccinoCnt + " cups");
        System.out.println("Total money earned: $" + moneyEarned);
        System.out.println("Ingredients consumed:");
        System.out.println("Water: " + (espressoCnt * 250 + latteCnt * 350 + cappuccinoCnt * 200) + " ml");
        System.out.println("Milk: " + (latteCnt * 75 + cappuccinoCnt * 100) + " ml");
        System.out.println("Coffee Beans: " + (espressoCnt * 16 + latteCnt * 20 + cappuccinoCnt * 12) + " grams");
        }


}
