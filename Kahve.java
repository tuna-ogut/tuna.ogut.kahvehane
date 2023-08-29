import java.util.ArrayList;
import java.util.List;

// Coffee class and its subclasses
class Coffee {
    private String name;
    private double price;
    private List<String> ingredients;

    public Coffee(String name, double price, List<String> ingredients ) {
        this.name = name;
        this.price = price;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getIngredients() {
        return new ArrayList<>(ingredients);
    }


}