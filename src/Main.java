public class Main {

    public static void main(String[] args) throws Exception {

        Product product1 = new Product();

        product1.setId("P001");
        product1.setName("Keyboard");
        product1.setPrice(45.99);
        product1.setStock(100);

        System.out.println("Producto 1:");
        System.out.println("ID: " + product1.getId());
        System.out.println("Nombre: " + product1.getName());
        System.out.println(product1.toString());

        System.out.println();

        Product product2 = new Product("P123", "Laptop", 1200.0, 50);

        
        product2.setPrice(999.99);
        product2.setStock(30);

        System.out.println("Producto 2:");
        System.out.println("Precio: " + product2.getPrice());
        System.out.println("Stock: " + product2.getStock());
        System.out.println(product2.toString());
    }
}         