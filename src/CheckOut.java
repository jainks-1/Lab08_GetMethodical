import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double totalPrice = 0;
        Boolean cont = false;

        do {
            double itemPrice = SafeInput.getRangedDouble(in, "Please enter the item price: ", 0.50, 10.00);
            totalPrice += itemPrice;
            cont = SafeInput.getYNConfirm(in, "Do you have more items to enter?");
        } while (cont);

        System.out.printf("\nTotal cost of items: $%.2f\n", totalPrice);
    }

}