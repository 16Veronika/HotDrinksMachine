import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottelOfWater implements VendingMachine {
    private List<Product> productList;

    public VendingMachineBottelOfWater(){
        productList = new ArrayList<>();
    }

    @Override
    public void initProducts(List<Product> productList) {
        
        this.productList = productList;
    }

    @Override
    public void addProduct(Product product) { //@Override - Полиморфизм
        
        productList.add(product);
    }

    @Override
    public Product getProduct(String name) {
        
        for(Product product: productList){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
    
}
