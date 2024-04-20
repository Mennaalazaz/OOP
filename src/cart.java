import java.util.Scanner;

public class cart {
    protected int customer_id;
    protected int nproduct;
    protected product[] arr;

    public cart(int customer_id, int nproduct) {
        this.nproduct = Math.abs(nproduct);
        this.arr = new product[nproduct];
    }

    public cart() {
    }

    public void setNproduct(int nproduct) {
        this.nproduct = Math.abs(nproduct);
    }

    public int getNproduct() {
        return nproduct;
    }

    public void setArr(product p, int index) {
        this.arr[index] = p;
    }

    public product[] getArr() {
        return arr;
    }

    public void addproduct(product p, int index) {
        if (index >= 0 && index < this.arr.length) {
            this.arr[index] = p;
        } else {
            System.out.println("out of bounds");
        }

    }

    public void removeproduct(int index) {
        this.arr[index] = null;
    }

    public double calculateprice() {
        double sum = 0.0;

        for (int i = 0; i < nproduct; i++) {
            if (this.getArr()[i] != null) {
                sum += arr[i].price;
            }
        }

        return sum;
    }

    public void placeorder(int j) {
        if (j==1) {
            for (int i = 0; i < nproduct; i++) {
                System.out.println(arr[i].name + " " + arr[i].price);
                arr[i] = null;
            }
        } else if (j==2) {
            System.out.println("Do you want to delete or add product? 1.delete or 2.add");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the index of the product you would like to remove");
                    int index = sc.nextInt();
                    removeproduct(index);
                    break;
                case 2:
                    System.out.println("enter the index of the product you would like to add");
                    int index1 = sc.nextInt();
                    System.out.println("which product you want to add to the cart?  1.smartphone 2.T-shirt 3.OOP");
                    Electronicproduct smartphone = new Electronicproduct(1, "Smartphone", 599.9F, "samsung", 1);
                    clothingproduct Tshirt = new clothingproduct(2, "T_shirt", 19.99F, "medium", "cotton");
                    Bookproduct OOP = new Bookproduct(3, "OOP", 39.99F, "O’Reilly", "X Publications");
                    int product = sc.nextInt();
                    switch (product) {
                        case 1:
                            addproduct(smartphone, index1);
                            break;
                        case 2:
                            addproduct(Tshirt, index1);
                            break;
                        case 3:
                            addproduct(OOP, index1);
                    }
                    for (int i = 0; i < nproduct; i++) {
                        System.out.println(arr[i].name + " " + arr[i].price);
                    }

            }

        }
    }
}
