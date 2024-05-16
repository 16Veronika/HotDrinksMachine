public class Main {
    public static void main(String[] args) {
        Product product1 = new HotDrink("1", 120, 500, 80);
        Product product2 = new HotDrink("2", 120, 200, 75);
        Product product3 = new HotDrink("coffee", 120, 500, 80);
        Product product4 = new HotDrink("milk", 150, 250, 75);

        HotDrinksAutomat vMachine = new HotDrinksAutomat();
        vMachine.addProduct(product1);
        vMachine.addProduct(product2);
        vMachine.addProduct(product3);
        vMachine.addProduct(product4);

        // Получение продукта по имени, объему и температуре
        Product hotDrink = vMachine.getProduct("coffee");
        if (hotDrink != null) {
            System.out.println("Found hot drink: " + hotDrink.getName() + ", Volume: " + ((HotDrink) hotDrink).getVolume() + "ml, Temperature: " + ((HotDrink) hotDrink).getTemperature() + "°C");
        } else {
            System.out.println("Hot drink not found.");
        }
    }
}
