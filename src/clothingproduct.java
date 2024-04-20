public class clothingproduct extends product {
        protected String size;
        protected String fabric;

    public clothingproduct(int product_id, String name, float price, String size, String fabric) {
            super(product_id, name, price);
            this.size = size;
            this.fabric = fabric;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setFabric(String fabric) {
            this.fabric = fabric;
        }

        public String getSize() {
            return size;
        }

        public String getFabric() {
            return fabric;
        }

}
