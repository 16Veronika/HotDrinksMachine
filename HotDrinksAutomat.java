import java.util.ArrayList;
import java.util.List;

public class HotDrinksAutomat implements VendingMachine {
   private List<Product> productList;

   public HotDrinksAutomat(){
        productList = new ArrayList<>();
    }

@Override
public void initProducts(List<Product> productList) {
    
    this.productList = productList;
}

@Override
public void addProduct(Product product) {
    
    productList.add(product);
}

public Product getProduct(String name, double volume, int temperature) {
    for (Product product : productList) {
        if (product instanceof HotDrink) {
            HotDrink hotDrink = (HotDrink) product;
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
    }
    return null;



}

@Override

    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
}


}
