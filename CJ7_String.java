public class CJ7_String {

    public static void main(String[] args) {

        String s1 = "Akash";
        String s2 = "akash";
        String s3 = "AKASH";

        // hashCode
        System.out.println(s1.hashCode());
        System.out.println(s1 == s2);

        // String akola = new String();

        // String new = "Akola";
        // m1
        String city = new String();
        city = "Akola";

        // m2
        String city2 = new String("Akola");

        char city3[] = { 'a', 'k', 'o', 'l', 'a' };

        // m3
        String city4 = "akola";

        String str = new String();
        str = "akash";
        System.out.println(str);

        String str2 = new String("Akash");
        System.out.println(str2);

        // charAt
        String str1 = "AkashRaviAthawale";
        System.out.println(str1.charAt(4));

        // concat
        s3 = s3.concat("Akash");
        System.out.println(s3);

        // compareTo
        System.out.println(s1.compareTo(s3));

    }

}
