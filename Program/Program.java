package Program;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */


    public static void main(String[] args) {
        Client client = new Client("Игорь,");
        Product product = new Product("Молоко", 2, 100);

        Order orderService = new Order();
        orderService.saveOrderToJson(client, product);
    }
}