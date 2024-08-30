import java.util.Scanner;

public class CJ4_Conditions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // IF - ELSE--------------------------------------------------

        // System.out.println("Enter the age : ");

        // int age = sc.nextInt();

        // if (age >= 18) {

        // System.out.println("You can vote ");

        // } else {

        // System.out.println("You cant vote ");
        // }

        // Ex 1 --LEAP YEAR

        // int year = sc.nextInt();

        // if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {

        // System.out.println("Leap year");
        // } else {

        // System.out.println("Common year");
        // }

        // SWITCH CASE---------------------------------------------------------------

        // System.out.println("Enter the num : ");

        // int num = sc.nextInt();

        // switch (num) {
        // case 1:
        // System.out.println("Monday");
        // break;

        // case 2:
        // System.out.println("Tuesday");
        // break;

        // case 3:
        // System.out.println("Wednesday");
        // break;

        // case 4:
        // System.out.println("Thursday");
        // break;

        // case 5:
        // System.out.println("Friday");
        // break;

        // case 6:
        // System.out.println("Saturday");
        // break;

        // case 7:
        // System.out.println("Sunday");
        // break;

        // default:
        // System.out.println("This no is not Exist");
        // break;

        // }

        // EX 2 Switch case

        // char ch = 'a';

        // switch (ch) {
        // case 'a':
        // System.out.println("a is Vowel");
        // break;

        // case 'e':
        // System.out.println("e is Vowel");
        // break;

        // case 'i':
        // System.out.println(" i is Vowel");
        // break;

        // case 'o':
        // System.out.println("o is Vowel");
        // break;

        // case 'u':
        // System.out.println("u is Vowel");
        // break;

        // default:
        // System.out.println("Consonenet");
        // break;
        // }

        // WHILE LOOP && DO-WHILE LOOP
        // ----------------------------------------------------------------

        // System.out.println("Enter no : ");
        // int n = sc.nextInt();

        // int i = 1;

        // /*
        // * while (i <= n) {
        // *
        // * System.out.println(i);
        // * i++;
        // * }
        // */

        // do {
        // System.out.println(i);
        // i++;
        // } while (i <= n);

        // FOR LOOP -----------------------------------------------------------

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // for (int j = 1; j <= n; j++) {
            // System.out.print("* ");
            // }

            // for (int j = 1; j <= i; j++) {
            // System.out.print("* ");
            // }

            // for (int j = n; j >= i; j--) {
            // System.out.print("* ");
            // }

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
