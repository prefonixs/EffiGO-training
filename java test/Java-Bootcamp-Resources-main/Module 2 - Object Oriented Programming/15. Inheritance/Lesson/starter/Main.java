import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class Main {
    public static void main(String[] args) {
        Shirt shirt = new Shirt(99.99,"Blue","Nike",Size.SMALL);
        // shirt.setSize(Size.SMALL);
        // shirt.setBrand("Nike");
        // shirt.setPrice(99.99);
        // shirt.setColor("Blue");
        shirt.fold();

        Pants pants=new Pants(79.77,"Black","Levi's",32,32);
        // pants.setWaist(32);
        // pants.setColor("Black");
        // pants.setPrice(79.99);
        // pants.setLength(32);
        // pants.setBrand("Levi's");
        pants.fold();

        productStore(shirt);
        productStore(pants);

        System.out.println(shirt);
    }

    public static void productStore(Product product){
        System.out.println("\nPurchase: "+product.getBrand()+" "+product.getClass().getSimpleName()+". Your total is "+product.getPrice());
        product.wear();
    }
}
