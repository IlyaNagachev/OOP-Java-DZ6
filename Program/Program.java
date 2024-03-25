package Program;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println("Укажите параметры заказа:");
        order.inputFromConsole();
        order.saveToJson();
    }

}