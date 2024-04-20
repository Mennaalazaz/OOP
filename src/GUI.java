import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
     JTextField idField;
     JTextField nameField;
     JTextField addressField;
     JButton addToCartButton;
     JButton placeOrderButton;
     JTextArea outputArea;

     Electronicproduct smartphone;
     clothingproduct tshirt;
     Bookproduct oop;
    customer customer;
     cart cart;

    public GUI() {
        initializeComponents();
        setLayout(new GridLayout(0, 2));
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initializeComponents() {
        idField = new JTextField();
        nameField = new JTextField();
        addressField = new JTextField();
        addToCartButton = new JButton("Add to Cart");
        placeOrderButton = new JButton("Place Order");
        outputArea = new JTextArea();
        outputArea.setEditable(false);

        addToCartButton.addActionListener(this);
        placeOrderButton.addActionListener(this);

        add(new JLabel("ID: "));
        add(idField);
        add(new JLabel("Name: "));
        add(nameField);
        add(new JLabel("Address: "));
        add(addressField);
        add(addToCartButton);
        add(placeOrderButton);
        add(outputArea);

        smartphone = new Electronicproduct(1, "Smartphone", 599.9F, "Samsung", 1);
        tshirt = new clothingproduct(2, "T-Shirt", 19.99F, "Medium", "Cotton");
        oop = new Bookproduct(3, "OOP", 39.99F, "O'Reilly", "X Publications");

        customer = new customer(0, "", "");


        cart = new cart(customer.getCustomer_id(), 3); // Assuming 3 products in cart initially
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addToCartButton) {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String address = addressField.getText();
            customer.setCustomer_id(id);
            customer.setName(name);
            customer.setAddress(address);

            String output = "";
            int productChoice = Integer.parseInt(JOptionPane.showInputDialog("Enter product choice: \n1. Smartphone\n2. T-Shirt\n3. OOP"));
            switch (productChoice) {
                case 1:
                    cart.setArr(smartphone, 0);
                    JOptionPane.showConfirmDialog(this, "smartphone costs 599.9$");
                    output = "Smartphone added to cart.\n";
                    break;
                case 2:
                    cart.setArr(tshirt, 1);
                    JOptionPane.showConfirmDialog(this, " tshirt costs 19.99$");
                    output = "T-Shirt added to cart.\n";
                    break;
                case 3:
                    cart.setArr(oop, 2);
                    JOptionPane.showConfirmDialog(this, "oop costs 39.99$");
                    output = "OOP book added to cart.\n";
                    break;
                default:
                    output = "Invalid choice.\n";
            }
            outputArea.append(output);
        } else if (e.getSource() == placeOrderButton) {
             float totalPrice = (float) cart.calculateprice();
            outputArea.append("Total price: $" + totalPrice + "\n");
            int option = JOptionPane.showConfirmDialog(this, "Do you want to place the order?");
            if (option == JOptionPane.YES_OPTION) {
                cart.placeorder(0);
                outputArea.append("Order placed successfully!\n");
            } else {
                outputArea.append("Order not placed.\n");
            }
        }
    }

}