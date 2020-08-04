package OCAstuff;

public class _9 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "";
        str2 = str2.concat("va");
        String str3 = "Ja";
        str3 = str3.concat(str2);

        System.out.println(str1);
        System.out.println(str3);

        if (str1 == str3) System.out.println("==");
        if (str1.equals(str3)) System.out.println("equals");


        System.out.println("========================");

        String one = "Java";
        String two = "Java";

        if (one == two) System.out.println("one == two");
        if (one.equals(two)) System.out.println("one equals two");

    }
}
