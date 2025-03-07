import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        birthMonth = SafeInput.getRangedInt(in, "Please enter your birth month: ", 1, 12);
        int birthDaty = 0;
        birthMonth = SafeInput.getRangedInt(in, "Please enter your birth day: ", 1, 31);

    }

}