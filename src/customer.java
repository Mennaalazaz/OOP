public class customer {
    protected int customer_id;
    protected String name;
    protected String address;

    public customer(int customer_id, String name, String address) {
        this.customer_id = Math.abs(customer_id);
        this.name = name;
        this.address = address;
    }

    public customer() {
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = Math.abs(customer_id);
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
