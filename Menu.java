import java.util.ArrayList;
import java.util.List;


class Menu {
    private List<Coffee> coffeeItems;


    public Menu(){
        coffeeItems = new ArrayList<>();

        initializeMenu();
    }

    private void initializeMenu(){
        //Espresso için:
        List<String> espressoIngredients = new ArrayList<>();
        espressoIngredients.add("1Espresso");
        Coffee espresso = new Coffee("Espresso", 20, espressoIngredients);
        coffeeItems.add(espresso);

        //Double Espresso için:
        List<String> doubleEspressoIngredients = new ArrayList<>();
        doubleEspressoIngredients.add("2Espresso");
        Coffee doubleEspresso = new Coffee("Double Espresso", 29, doubleEspressoIngredients);
        coffeeItems.add(doubleEspresso);

        // Cappucino için:
        List<String> cappuccinoIngredients = new ArrayList<>();
        cappuccinoIngredients.add("1Espresso");
        cappuccinoIngredients.add("2Steamed Milk");
        cappuccinoIngredients.add("2Milk Foam");
        Coffee cappuccino = new Coffee("Cappuccino", 27, cappuccinoIngredients);
        coffeeItems.add(cappuccino);

        //Americano için
        List<String> americanoIngredients = new ArrayList<>();
        americanoIngredients.add("1Espresso");
        americanoIngredients.add("4Hot Water");
        Coffee americano = new Coffee("Americano", 25, americanoIngredients);
        coffeeItems.add(americano);

        //Coffee Latte için
        List<String> coffeeLatteIngredients = new ArrayList<>();
        coffeeLatteIngredients.add("1Espresso");
        coffeeLatteIngredients.add("3Steamed Milk");
        coffeeLatteIngredients.add("1Milk Foam");
        Coffee coffeeLatte = new Coffee("Coffee Latte", 27, coffeeLatteIngredients);
        coffeeItems.add(coffeeLatte);

        //Mocha için:
        List<String> mochaIngredients = new ArrayList<>();
        mochaIngredients.add("1Espresso");
        mochaIngredients.add("1Steamed Milk");
        mochaIngredients.add("1Milk Foam");
        mochaIngredients.add("2Hot Chocolate");
        Coffee mocha = new Coffee("Mocha", 32, mochaIngredients);
        coffeeItems.add(mocha);

        List<String> hotWaterIngredients = new ArrayList<>();
        hotWaterIngredients.add("5Hot Water");
        Coffee hotWater = new Coffee("Hot Water", 5, hotWaterIngredients);
        coffeeItems.add(hotWater);
    }

    public void displayMenu(){
        System.out.println("Menü: ");
        for(int i = 0 ; i < coffeeItems.size(); i++ ){
            System.out.println(i + 1 + ". " + coffeeItems.get(i).getName() + " " + coffeeItems.get(i).getPrice() );
        }
    }

    public Coffee getByIndex(int i){
        int index = i-1;
        if (index >= 0 && index < coffeeItems.size()) {
            return coffeeItems.get(index);
        }
        return null;
    }


}
