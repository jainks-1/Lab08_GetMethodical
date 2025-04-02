import java.util.Scanner;
public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int favNum = 0;
        double favDou = 0.0;

        favNum = SafeInput.getInt(in, "Enter your favorite integer");
        favDou = SafeInput.getDouble(in, "Enter your favorite double");

        System.out.println("Your favorite integer is: " + favNum + " and your favorite double is: " + favDou);

    }
}
