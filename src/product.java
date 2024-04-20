public class product {
    protected int productId;
    protected String name;
    protected float price;

    public product(int productId, String name, float price) {
        this.productId = Math.abs(productId);
        this.price = Math.abs(price);
        this.name = name;
    }

    public void setproductId(int productId) {
        if (productId < 0) {
            this.productId = Math.abs(productId);
        } else {
            this.productId = productId;
        }

    }

    public void setprice(float price) {
        if (price < 0) {
            this.price = Math.abs(price);
        } else {
            this.price = price;
        }

    }

    public void setname(String name) {
        this.name = name;
    }

    public int getproductId() {
        return productId;
    }

    public String getname() {
        return name;
    }

    public float getprice() {
        return price;
    }
}
