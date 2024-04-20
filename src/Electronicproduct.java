public class Electronicproduct extends product {
    protected String brand;
    protected int warrantlyprice;

    public Electronicproduct(int productId, String name, float price, String brand, int warrantlyprice) {
        super(productId, name, price);
        this.brand = brand;
        this.warrantlyprice = Math.abs(warrantlyprice);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setWarrantlyprice(int warrantlyprice) {
        this.warrantlyprice = Math.abs(warrantlyprice);
    }

    public int getWarrantlyprice() {
        return warrantlyprice;
    }

}
