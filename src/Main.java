
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            GUI G=new GUI();
            ////////////////////////////////////////////////////////////
            Scanner in = new Scanner(System.in);
            System.out.println("welcome to the E_commerce System");
            Electronicproduct smartphone = new Electronicproduct(1, "Smartphone", 599.9F, "samsung", 1);
            clothingproduct Tshirt = new clothingproduct(2, "T_shirt", 19.99F, "medium", "cotton");
            Bookproduct OOP = new Bookproduct(3, "OOP", 39.99F, "O’Reilly", "X Publications");
            System.out.println("please enter your id");
            int id = in.nextInt();
            System.out.println("please enter your name");
            String name = in.next();
            System.out.println("please enter your address");
            String address = in.next();
            customer me = new customer(id, name, address);
            System.out.println("How many product you want to add to the cart ? ");
            int n = in.nextInt();
            cart c = new cart(me.customer_id, n);
            order o = new order(me.customer_id, 1);

            for(int i = 0; i < n; ++i) {
                System.out.println("which product you want to add to the cart?  1.smartphone 2.T-shirt 3.OOP ");
                int product = in.nextInt();
                switch (product) {
                    case 1:
                        c.setArr(smartphone, i);
                        break;
                    case 2:
                        c.setArr(Tshirt, i);
                        break;
                    case 3:
                        c.setArr(OOP, i);
                }
            }

            System.out.print("your total is : $" + c.calculateprice());
            System.out.println(" would you like to place the order ? 1.yes 2.No");
             c.placeorder(in.nextInt());
            }
        }