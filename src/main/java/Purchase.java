import java.util.Map;

public class Purchase {
    // перенесли заполнение корзины в отдельный класс Basket,
    // так как это нарушало первый принцип SOLID - принцип единственной ответственности

    protected String title;
    protected int count;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }
}