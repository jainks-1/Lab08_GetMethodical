import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        birthYear = SafeInput.getRangedInt(in, "Please enter your birth year: ", 1950, 2015);
        int birthMonth = 0;
        birthMonth = SafeInput.getRangedInt(in, "Please enter your birth month: ", 1, 12);

        int birthDay = 0;

        switch (birthMonth) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                birthDay = SafeInput.getRangedInt(in, "Please enter your birth day: ", 1, 31);
                break;

            case 4: case 6: case 9: case 11:
                birthDay = SafeInput.getRangedInt(in, "Please enter your birth day: ", 1, 30);
                break;

            case 2:
                // Check if it's a leap year
                if ((birthYear % 4 == 0 && birthYear % 100 != 0) || (birthYear % 400 == 0)) {
                    birthDay = SafeInput.getRangedInt(in, "Please enter your birth day: ", 1, 29);
                } else {
                    birthDay = SafeInput.getRangedInt(in, "Please enter your birth day: ", 1, 28);
                }
                break;
        }

    }

}