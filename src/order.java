public class order {
    protected int customer_id;
    protected int orderID;
    protected float totalprice;

    public order(int customer_id, int orderID) {
        this.customer_id = customer_id;
        this.orderID = orderID;
    }

    public void printorderInfo(cart n, customer s) {
        System.out.println("Here is order's summary :");
        System.out.println("Order ID: " + orderID);
        System.out.println("customer ID: " + s.customer_id);
        System.out.println("products:");

        for(int i = 0; i < n.nproduct; ++i) {
            System.out.println(n.getArr()[i].name + " \t  $" + n.getArr()[i].price);
        }

        System.out.println("Total Price : " + Math.abs(n.calculateprice()));
    }
}
