import java.util.HashMap;
import java.util.Map;

public class Products {
    private static HashMap<String, Integer> products = new HashMap<>();

    static {
        products.put("Хлеб", 56);
        products.put("Масло", 153);
        products.put("Колбаса", 211);
        products.put("Пирожок", 45);
    }

    public static HashMap<String, Integer> getProducts() {
        return products;
    }

    @Override
    public String toString () {
        StringBuilder str = new StringBuilder("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            str.append("\n" + productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
        return str.toString();
    }
}
