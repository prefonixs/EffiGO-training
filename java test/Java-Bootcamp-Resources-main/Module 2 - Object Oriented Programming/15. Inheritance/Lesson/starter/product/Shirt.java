package product;

public class Shirt extends Product{

    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    public Shirt(double price, String color, String brand,Size size) {
        super(price, color, brand);
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Fold shirts like a shirt");
    }

    @Override
    public void wear() {
        System.out.println("The "+this.size+" shirt suits you well!");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "SHIRT: "+size+" "+super.getBrand()+" "+super.getColor()+" "+super.getPrice();
    }

}
