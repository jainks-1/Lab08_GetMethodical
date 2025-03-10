// Done in class, lab 8

import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String SSN = "";
        String MID ="";
        String Choice = "";

        SSN = SafeInput.getRegExString(in, "\nEnter your SSN with hyphens", "^\\d{3}-\\d{2}-\\d{4}$");
        MID = SafeInput.getRegExString(in, "\nEnter your M number", "^(M|m)\\d{5}$");
        Choice = SafeInput.getRegExString(in, "\nEnter your Choice [Oo,Ss,Vv,Qq]", "^[OoSsVvQq]$");
    }

}