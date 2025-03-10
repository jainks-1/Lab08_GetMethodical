import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String userMessage = SafeInput.getNonZeroLenString(in, "Enter a message to display in the header");

        // print everything
        SafeInput.prettyHeader(userMessage);
    }
}