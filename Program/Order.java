package Program;

import java.io.FileWriter;
import java.io.IOException;

public class Order {

    public void saveOrderToJson(Client client, Product product) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"Имя\":\""+ client.getName() + "\",\n");
            writer.write("\"Продукт\":\""+product.getName()+"\",\n");
            writer.write("\"Количество\":"+product.getQuantity()+",\n");
            writer.write("\"Цена\":"+product.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


